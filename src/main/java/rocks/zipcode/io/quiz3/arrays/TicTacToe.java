package rocks.zipcode.io.quiz3.arrays;

import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        board = new String[3][3];
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < 3; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isHomogenous(String[] arr) {
        for (String s : arr) {
            if (!s.equals(arr[0])) {
                return false;
            }
        }
        return true;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return isHomogenous(getRow(rowIndex));
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return isHomogenous(getColumn(columnIndex));
    }

    public String getWinner() {
        for (int i = 0; i < 3; i++) {
            if(isRowHomogenous(i)) {
                return board[i][0];
            }
            if (isColumnHomogeneous(i)) {
                return board[0][i];
            }
        }

        if (board[0][0].equals(board[1][1]) && board[2][2].equals(board[1][1])) {
            return board[1][1];
        }
        if (board[2][0].equals(board[1][1]) && board[0][2].equals(board[1][1])) {
            return board[1][1];
        }
        return "TIE";
    }

    public String[][] getBoard() {
        return board;
    }
}
