package com.hillel.projects.game;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class TicTacToe {

    private Board board = new Board();

    private Player player1;
    private Player player2;

    private Player currentPlayer;

    public TicTacToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

        currentPlayer = player1;
    }

    public String startGame() {
        while (!gameFinished()) {
            makeMove();
            board.print();
            changeCurrentPlayer();
        }
        return calculateWinner();
    }

    private String calculateWinner() {
        char winnerSymbol = board.getWinnerSymbol();
        return "The winner is " + winnerSymbol;
    }

    private boolean gameFinished() {
        return board.checkHorizontals() ||
                board.checkVerticals() ||
                board.checkDiagonals() ||
                board.allFieldsChecked();
    }

    private void changeCurrentPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    private void makeMove() {
        String move = currentPlayer.makeMove();

        int row = move.charAt(0) - 48;
        int column = move.charAt(1) - 48;

        board.setMove(row, column, currentPlayer.getSymbol());
    }

}
