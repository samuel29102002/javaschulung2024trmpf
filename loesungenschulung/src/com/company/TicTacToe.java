package com.company;

import java.util.Scanner;

public class TicTacToe {
    static char[][] board = { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '} };
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameOn = true;

        while (gameOn) {
            printBoard();
            playerMove(scanner);
            gameOn = !checkWinner() && !isBoardFull();
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        printBoard();
        if (checkWinner()) {
            System.out.println("Spieler " + currentPlayer + " gewinnt!");
        } else {
            System.out.println("Unentschieden!");
        }

        scanner.close();
    }

    public static void printBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    public static void playerMove(Scanner scanner) {
        int row, col;
        while (true) {
            System.out.println("Spieler " + currentPlayer + ", gib deine Position (Reihe und Spalte) ein:");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Ungültiger Zug, versuche es erneut.");
            }
        }
    }

    public static boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
                return true;
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
                return true;
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
            return true;
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
            return true;
        return false;
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
