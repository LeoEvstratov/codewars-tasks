package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean check(int[][] sudoku) {
        return checkRow(sudoku) && checkColumn(sudoku) && checkSector(sudoku);
    }

    private static boolean checkColumn(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            int[] column = new int[9];
            for (int j = 0; j < sudoku.length; j++) {
                column[j] = sudoku[j][i];
            }
            if (nonValid(column)) return false;
        }
        return true;
    }

    private static boolean nonValid(int[] numbers) {
        if (Arrays.stream(numbers).anyMatch(i -> i == 0)
                || Arrays.stream(numbers).distinct().count() != 9) return true;
        return false;
    }

    private static boolean checkRow(int[][] sudoku) {
        for (int[] row : sudoku) {
            if (nonValid(row)) return false;
        }
        return true;
    }

    private static boolean checkSector(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; ) {
            for (int j = 0; j < sudoku.length; ) {
                int[][] sector = {
                        {sudoku[i][j], sudoku[i][j + 1], sudoku[i][j + 2]},
                        {sudoku[i + 1][j], sudoku[i + 1][j + 1], sudoku[i + 1][j + 2]},
                        {sudoku[i + 2][j], sudoku[i + 2][j + 1], sudoku[i + 2][j + 2]}
                };
                if (nonValid(toFlatArray(sector))) return false;
                j += 3;
            }
            i += 3;
        }
        return true;
    }

    private static int[] toFlatArray(int[][] sector) {
        final int[] result = new int[9];
        int counter = 0;

        for (int i = 0; i < sector.length; i++) {
            for (int j = 0; j < sector.length; j++) {
                result[counter] = sector[i][j];
                counter++;
            }
        }
        return result;
    }
}