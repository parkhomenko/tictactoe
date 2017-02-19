package com.hillel.projects.template.method;

public class PythonCompiler extends Compiler {

    @Override
    protected void writeCode() {
        System.out.println("Code for Python");
    }

    @Override
    protected void correctErrors() {
        System.out.println("corrections");
    }

    @Override
    protected void compile() {
        System.out.println("compile with python compiler");

    }

    @Override
    protected void test() {
        System.out.println("test everything");
    }

    @Override
    protected void launch() {
        System.out.println("start python program");
    }
}
