package com.hillel.projects.game;

import java.util.Random;

public class ComputerPlayer implements Player {

    private String name = "PC";
    private char symbol;

    public ComputerPlayer(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String makeMove() {
        Random random = new Random();
        int r = random.nextInt(3);
        int c = random.nextInt(3);
        String move = String.valueOf(r) + String.valueOf(c);

        return move;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
