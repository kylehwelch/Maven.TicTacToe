package rocks.zipcodewilmington.tictactoe;

import java.util.*;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;

    public Board(Character[][] matrix) {
        board = matrix;
    }

    public Boolean isInFavorOfX() {
        return getWinner().equals("X");
    }

    public Boolean isInFavorOfO() {
        return getWinner().equals("O");
    }

    public Boolean isTie() {
        return getWinner().equals("");
    }

    public String getWinner() {
        List<String> results = new ArrayList<String>();

        results.add(String.valueOf(board[0][0]) + board [0][1] + board[0][2]);
        results.add(String.valueOf(board[1][0]) + board [1][1] + board[1][2]);
        results.add(String.valueOf(board[2][0]) + board [2][1] + board[2][2]);

        results.add(String.valueOf(board[0][0]) + board [1][0] + board[2][0]);
        results.add(String.valueOf(board[0][1]) + board [1][1] + board[2][1]);
        results.add(String.valueOf(board[0][2]) + board [1][2] + board[2][2]);

        results.add(String.valueOf(board[0][0]) + board [1][1] + board[2][2]);
        results.add(String.valueOf(board[0][2]) + board [1][1] + board[2][0]);

        System.out.println(results);

        if (results.contains("XXX")) return "X";
        else if (results.contains("OOO")) return "O";
        else return "";
    }

}
