package org.lumier.ir;

import java.util.Arrays;

public class Instruction {
    final InstructionType type;
    final Object[] args;
    public Instruction(InstructionType type, Object... args) {
        this.type = type;
        this.args = args;
    }
    public InstructionType getType() {
        return type;
    }
    public Object[] getArgs() {
        return args;
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "type=" + type +
                ", args=" + Arrays.toString(args) +
                '}';
    }
}
