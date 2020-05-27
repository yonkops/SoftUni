
package matrixShuffling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = line[col];
            }
        }
        String line;
        while (true){
            if ("END".equals(line = scanner.nextLine())){
                break;
            }
            try{
                input = line.split("\\s+");
                if (!input[0].equals("swap") && input.length != 5){
                    System.out.println("Invalid input!");
                    continue;
                }
                int row1 = Integer.parseInt(input[1]);
                int col1 = Integer.parseInt(input[2]);
                int row2 = Integer.parseInt(input[3]);
                int col2 = Integer.parseInt(input[4]);

                swap(matrix, row1, col1, row2, col2);
                printMarix(matrix);
            } catch (IndexOutOfBoundsException | NumberFormatException e) { // IndexOutOfBoundsException
                System.out.println("Invalid input!");
            }
        }
    }

    private static void swap(String[][] matrix, int row1, int col1, int row2, int col2) {
        String temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }

    private static void printMarix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
