package org.lumier;

import org.lumier.ir.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SuppressWarnings("ALL")
public class LumierVisitorImpl extends LumierBaseVisitor<Object> {
    private Program programContext = new Program();

    @Override
    public Program visitCompilationUnit(LumierParser.CompilationUnitContext ctx) {
        for (LumierParser.FunctionContext functionContext : ctx.function()) {
            visitFunction(functionContext);
        }
        return programContext;
    }

    @Override
    public Void visitFunction(LumierParser.FunctionContext ctx) {
        String name = ctx.function_signature().IDENTIFIER().getText();
        List<Instruction> instructions = visitBlock(ctx.block());
        if (programContext.getFunctions().containsKey(name)) {
            throw new RuntimeException("Function " + name + " already exists");
        }
        List<Type> parameters = new ArrayList<>();
        for (LumierParser.TypeContext typeContext : ctx.function_signature().parameters().type()) {
            parameters.add(Type.fromKeyword(typeContext.getText()));
        }

        List<Type> returnTypes = new ArrayList<>();
        if (ctx.function_signature().return_types() != null)
            for (LumierParser.TypeContext typeContext : ctx.function_signature().return_types().type()) {
                returnTypes.add(Type.fromKeyword(typeContext.getText()));
            }
        Function function = new Function(name, instructions, parameters, returnTypes);
        programContext.getFunctions().put(name, function);
        return null;
    }

    @Override
    public Instruction visitIf_block(LumierParser.If_blockContext ctx) {
        return new Instruction(InstructionType.If, visitBlock(ctx.block()), ctx.else_block() != null ? visitBlock(ctx.else_block().block()) : null);
    }

    @Override
    public List<Instruction> visitBlock(LumierParser.BlockContext ctx) {
        List<Instruction> instructions = new ArrayList<>();
        for (LumierParser.StatementContext instructionContext : ctx.statement()) {
            instructions.addAll((Collection<Instruction>) visitStatement(instructionContext));
        }
        return instructions;
    }

    @Override
    public List<Instruction> visitStatement(LumierParser.StatementContext ctx) {
        List<Instruction> instructions = new ArrayList<>();
        // Check if it's a push value instruction
        if (ctx.push_value_statement() != null) {
            instructions.add(visitPush_value_statement(ctx.push_value_statement()));
        } else if (ctx.function_call() != null) {
            instructions.add(visitFunction_call(ctx.function_call()));
        } else if (ctx.operation() != null) {
            switch (ctx.operation().getText()) {
                case "=":
                    instructions.add(new Instruction(InstructionType.Equals));
                    break;
                case "+":
                    instructions.add(new Instruction(InstructionType.Add));
                    break;
                case "-":
                    instructions.add(new Instruction(InstructionType.Sub));
                    break;
                case "*":
                    instructions.add(new Instruction(InstructionType.Mul));
                    break;
                case "/":
                    instructions.add(new Instruction(InstructionType.Div));
                    break;
                case "%":
                    instructions.add(new Instruction(InstructionType.Mod));
                    break;
                case "^":
                    instructions.add(new Instruction(InstructionType.Pow));
                    break;
            }
        } else if (ctx.if_block() != null) {
            instructions.add(visitIf_block(ctx.if_block()));
        }
        return instructions;
    }

    @Override
    public Instruction visitPush_value_statement(LumierParser.Push_value_statementContext ctx) {
        if (ctx.expr().STRING() != null) {
            return new Instruction(InstructionType.Push, ctx.expr().getText().substring(1, ctx.expr().getText().length() - 1));
        } else if (ctx.expr().NUMBER() != null) {
            return new Instruction(InstructionType.Push, Integer.parseInt(ctx.expr().getText()));
        }
        throw new RuntimeException("Unreachable or unimplemented");
    }

    @Override
    public Instruction visitFunction_call(LumierParser.Function_callContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        if (name.equals("print")) {
            return new Instruction(InstructionType.Print);
        }
        return new Instruction(InstructionType.CallFunction, name);
    }
}
