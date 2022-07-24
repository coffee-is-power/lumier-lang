package org.lumier;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.lumier.ir.IRChecker;
import org.lumier.ir.Program;
import org.lumier.ir.RunIR;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LumierLexer lexer = new LumierLexer(CharStreams.fromFileName("src/main/lumier/Example.lm"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LumierParser parser = new LumierParser(tokens);
        LumierParser.CompilationUnitContext tree = parser.compilationUnit();
        LumierVisitorImpl visitor = new LumierVisitorImpl();
        Program context = (Program) visitor.visit(tree);
        new IRChecker(context).checkProgram();
        RunIR runIR = new RunIR(context);
        runIR.runProgram();
    }
}