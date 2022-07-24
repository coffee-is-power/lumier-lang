package org.lumier.ir;

import java.util.HashMap;
import java.util.Map;

public class Program {
    final Map<String, Function> functions = new HashMap<>();

    public Map<String, Function> getFunctions() {
        return functions;
    }
    @Override
    public String toString() {
        return "ProgramContext{" +
                "functions=" + functions +
                '}';
    }
}
