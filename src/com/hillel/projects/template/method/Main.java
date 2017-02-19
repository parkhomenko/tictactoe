package com.hillel.projects.template.method;

public class Main {
    public static void main(String[] args) {
        Compiler compiler = new JavaCompiler();
        compiler.startProgram();

        Compiler python = new PythonCompiler();
        python.startProgram();
    }
}
