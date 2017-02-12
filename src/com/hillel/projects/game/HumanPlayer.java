package com.hillel.projects.game;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HumanPlayer implements Player {
    private String firstName;
    private String lastName;
    private int age;
    private char symbol;

    public HumanPlayer(String firstName, String lastName, int age, char symbol) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.symbol = symbol;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String makeMove() {
        Scanner scanner =
                new Scanner(System.in, StandardCharsets.UTF_8.toString());

        String move = scanner.next();

        return move;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
