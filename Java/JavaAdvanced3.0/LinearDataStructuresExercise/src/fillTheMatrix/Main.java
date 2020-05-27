package fillTheMatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(", ");
        reader.close();
        int matrixSize = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = new int[matrixSize][matrixSize];

        if (pattern.equals("A")){
            matrixPatterA(matrix);
            printMatrix(matrix);
        } else if (pattern.equals("B")){
            matrixPatterB(matrix);
            printMatrix(matrix);
        }


    }
    public static void matrixPatterA(int[][] matrix){
        int currentNumber = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = currentNumber;
                currentNumber ++;
            }
        }
    }
    public static void matrixPatterB(int[][] matrix){
        int currentNumber = 1;
        int matrixCol = 0;
        while(currentNumber <= Math.pow(matrix.length, 2)){
            if (matrixCol % 2 == 0){
                // fill the matrix from top to bottom
                for (int i = 0; i < matrix.length ; i++) {
                    matrix[i][matrixCol] = currentNumber;
                    currentNumber ++;
                }
            } else if (matrixCol % 2 == 1){
                // fill the matrix from bottom to top
                for (int i = matrix.length - 1; i >= 0 ; i--) {
                    matrix[i][matrixCol] = currentNumber;
                    currentNumber ++;
                }
            }
            matrixCol ++;
        }
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix.length){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
