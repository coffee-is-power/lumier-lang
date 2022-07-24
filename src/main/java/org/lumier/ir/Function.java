package org.lumier.ir;

import java.util.ArrayList;
import java.util.List;

public class Function {
    final List<Instruction> instructions;
    final String name;
    final List<Type> parameters;
    final List<Type> return_types;
    // Constructor that accepts all fields
    public Function(String name, List<Instruction> instructions, List<Type> parameters, List<Type> return_types) {
        this.name = name;
        this.parameters = parameters;
        this.return_types = return_types;
        this.instructions = instructions;
    }
    public Function(String name, List<Instruction> instructions) {
        this.name = name;
        this.instructions = instructions;
        this.parameters = new ArrayList<>();
        this.return_types = new ArrayList<>();
    }
    public List<Instruction> getInstructions() {
        return instructions;
    }
    public String getName() {
        return name;
    }
    public List<Type> getParameters() {
        return parameters;
    }
    public List<Type> getReturnTypes() {
        return return_types;
    }
    @Override
    public String toString() {
        return "Function{" +
                "instructions=" + instructions +
                ", name='" + name + '\'' +
                ", parameters=" + parameters +
                ", return_types=" + return_types +
                '}';
    }
}
