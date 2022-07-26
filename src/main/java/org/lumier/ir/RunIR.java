package org.lumier.ir;

import java.util.List;
import java.util.Stack;

@SuppressWarnings("ALL")
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
        runInstructions(function.getInstructions());
    }

    public void runInstructions(List<Instruction> instructionList) {
        for (Instruction instruction : instructionList) {
            switch (instruction.getType()) {
                case Print:
                    System.out.println(stack.pop());
                    break;
                case Push:
                    stack.push(instruction.args[0]);
                    break;
                case Equals:
                    stack.push(stack.pop().equals(stack.pop()));
                    break;
                case Add:
                    stack.push((Integer) stack.pop() + (Integer) stack.pop());
                    break;
                case Sub: {
                    int top = (Integer) stack.pop();
                    int second = (Integer) stack.pop();
                    stack.push(second - top);
                    break;
                }
                case Div: {
                    int top = (Integer) stack.pop();
                    int second = (Integer) stack.pop();
                    stack.push(second / top);
                    break;
                }
                case Mod: {
                    int top = (Integer) stack.pop();
                    int second = (Integer) stack.pop();
                    stack.push(second % top);
                    break;
                }
                case Mul:
                    stack.push((Integer) stack.pop() * (Integer) stack.pop());
                    break;
                case Pow: {
                    int top = (Integer) stack.pop();
                    int second = (Integer) stack.pop();
                    stack.push(Math.pow(second, top));
                    break;
                }
                case CallFunction:
                    runFunction(program.functions.get((String) instruction.args[0]));
                    break;
                case If:
                    if ((Boolean) stack.pop()) {
                        runInstructions((List<Instruction>) instruction.args[0]);
                    } else if (instruction.args[1] != null) {
                        runInstructions((List<Instruction>) instruction.args[1]);
                    }
                    break;
                case Dup:
                    stack.push(stack.peek());
                    break;
                case Swap: {
                    Object top = stack.pop();
                    Object second = stack.pop();
                    stack.push(top);
                    stack.push(second);
                    break;
                }
                case Rot: {
                    Object top = stack.pop();
                    Object second2 = stack.pop();
                    Object third = stack.pop();
                    stack.push(second2);
                    stack.push(top);
                    stack.push(third);
                    break;
                }
                case Pop:
                    stack.pop();
                    break;
            }
        }
    }
}
