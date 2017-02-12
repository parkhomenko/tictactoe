package com.hillel.projects.game;

public class GameMain {

    public static void main(String[] args) {

        Player player1 = new HumanPlayer("John", "Wick", 51, 'X');
        Player player2 = new ComputerPlayer('O');

        TicTacToe ticTacToe = new TicTacToe(player1, player2);
        String winner = ticTacToe.startGame();

        System.out.println(winner);

    }
}
