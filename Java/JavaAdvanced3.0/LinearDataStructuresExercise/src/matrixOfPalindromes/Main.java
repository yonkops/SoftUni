package matrixOfPalindromes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        reader.close();


        String[][] matrix = new String[row][col];
        fillMatrix(matrix);
        printMatrix(matrix);
        
    }

    private static void fillMatrix(String[][] matrix) {
        char midChar = 'a';
        char baseChar = 'a';
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = "" + baseChar+midChar+baseChar;
                midChar++;
            }
            baseChar++;
            midChar = baseChar;
        }
    }

    public static void printMatrix(String[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
