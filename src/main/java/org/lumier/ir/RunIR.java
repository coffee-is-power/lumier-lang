package org.lumier.ir;

import java.util.Stack;

public class RunIR {
    final Program program;
    final Stack<Object> stack = new Stack<>();
    public RunIR(Program program) {
        this.program = program;
    }

    public void runProgram() {
        runFunction(program.getFunctions().get("main"));
    }
    public void runFunction(Function function) {
        for (Instruction instruction : function.getInstructions()) {
            switch (instruction.getType()) {
                case Print:
                    System.out.println(stack.pop());
                    break;
                case Push:
                    stack.push(instruction.args[0]);
                    break;
                case Add:
                    stack.push((Integer) stack.pop() + (Integer) stack.pop());
                    break;
                case Sub:
                    stack.push((Integer) stack.pop() - (Integer) stack.pop());
                    break;
                case Div:
                    stack.push((Integer) stack.pop() / (Integer) stack.pop());
                    break;
                case Mod:
                    stack.push((Integer) stack.pop() % (Integer) stack.pop());
                    break;
                case Mul:
                    stack.push((Integer) stack.pop() * (Integer) stack.pop());
                    break;
                case Pow:
                    stack.push((Integer) stack.pop() ^ (Integer) stack.pop());
                    break;
                case CallFunction:
                    runFunction(program.functions.get((String) instruction.args[0]));
                    break;
            }
        }
    }
}
