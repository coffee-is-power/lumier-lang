package org.lumier.ir;

import java.util.*;

public class IRChecker {
    final Program program;
    final Map<String, Function> unusedFunctions;
    public IRChecker(Program program) {
        this.program = program;
        this.unusedFunctions = new HashMap<>(this.program.functions);
    }
    public void checkProgram() {
        if (!this.program.functions.containsKey("main")) {
            throw new RuntimeException("No entry point found");
        }
        checkFunction(program.functions.get("main"));
        for (String functionName : unusedFunctions.keySet()) {
            System.err.println("Warn: Function " + functionName + " is never used");
            checkFunction(unusedFunctions.get(functionName));
        }
    }
    public void checkFunction(Function function) {
        unusedFunctions.remove(function.name);
        Stack<Type> typeStack = new Stack<>();
        typeStack.addAll(function.getParameters());
        for (Instruction instruction : function.getInstructions()) {
            checkInstruction(instruction, typeStack);
        }

        checkReturnTypes(function, typeStack);
    }

    public void checkInstruction(Instruction instruction, Stack<Type> typeStack) {
        switch (instruction.getType()) {
            case Print:
                checkPrint(typeStack);
                break;
            case Push:
                checkPush(instruction, typeStack);
                break;
            case Add:
            case Sub:
            case Mul:
            case Div:
            case Mod:
            case Pow:
                checkOp(typeStack);
                break;
            case CallFunction:
                checkCallFunction(instruction, typeStack);
                break;
            default:
                throw new IllegalArgumentException("Unknown instruction type: " + instruction.getType());
        }
    }

    public void checkCallFunction(Instruction instruction, Stack<Type> typeStack) {
        Function function = program.getFunctions().get((String) instruction.args[0]);
        if (function == null) {
            throw new IllegalArgumentException("Unknown function: " + instruction.args[0]);
        }
        if (function.getParameters().size() != typeStack.size()) {
            throw new IllegalArgumentException("Wrong number of arguments for function: " + instruction.args[0]);
        }
        checkFunction(function);
        for (int i = 0; i < function.getParameters().size(); i++) {
            typeStack.pop();
        }
        typeStack.addAll(function.getReturnTypes());
    }


    public void checkOp(Stack<Type> typeStack) {
        if (typeStack.size() < 2) {
            throw new IllegalArgumentException("Not enough operands on stack");
        }
        Type type1 = typeStack.pop();
        Type type2 = typeStack.pop();
        if (type1 != Type.Integer || type2 != Type.Integer) {
            throw new IllegalArgumentException("Expected Integer Integer, but got " + type1 + " " + type2);
        }
        typeStack.push(Type.Integer);
    }



    public void checkPush(Instruction instruction, Stack<Type> typeStack) {
        // Push the type of the argument onto the stack
        typeStack.push(instruction.args[0] instanceof Integer ? Type.Integer : Type.String);
    }

    public void checkPrint(Stack<Type> typeStack) {
        if (typeStack.isEmpty()) {
            throw new IllegalArgumentException("Print instruction requires a parameter");
        }
        typeStack.pop();
    }

    public void checkReturnTypes(Function function, Stack<Type> typeStack) {
        // The type stack size must be equal to the return types size
        if (typeStack.size() != function.getReturnTypes().size()) {
            throw new RuntimeException("Function " + function.getName() + " has " + typeStack.size() + " return values but " + function.getReturnTypes().size() + " were expected");
        }
        List<Type> returnTypes = new ArrayList<>(function.getReturnTypes());
        Collections.reverse(returnTypes);
        for (int i = 0; i < function.getReturnTypes().size(); i++) {

            if (!typeStack.pop().equals(returnTypes.get(i))) {
                throw new RuntimeException("Function " + function.getName() + " has a return type " + typeStack.get(typeStack.size() - 1 - i) + " but " + function.getReturnTypes().get(i) + " was expected");
            }
        }
    }
}
