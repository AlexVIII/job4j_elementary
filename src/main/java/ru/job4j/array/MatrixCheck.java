package ru.job4j.array;


public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char c;
        for (int j = 0; j < 3; j++) {
            c = board[row][j];
            if (c != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}

