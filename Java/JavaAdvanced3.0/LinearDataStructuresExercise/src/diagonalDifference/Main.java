package diagonalDifference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        int matrixSize = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[matrixSize][matrixSize];
        String[] buffer;

        for (int i = 0; i < matrixSize ; i++) {
            buffer = reader.readLine().split(" ");
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = Integer.parseInt(buffer[j]);
            }
        }
        reader.close();
        checkDiagonalDifference(matrix);
    }

    private static void checkDiagonalDifference(int[][] matrix) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int matrixSize = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            primaryDiagonal += matrix[i][i];
            secondaryDiagonal += matrix[i][matrixSize - i];
        }
        int diagonalDifference = Math.abs(primaryDiagonal - secondaryDiagonal);
        System.out.println(diagonalDifference);
    }
}
