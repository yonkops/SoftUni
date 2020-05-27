package maximalSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        int[][] matrix = new int[row][col];


        for (int i = 0; i < matrix.length ; i++) {
            input = reader.readLine().split(" ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }

        }
        reader.close();
        findMaxSum(matrix);

    }

    private static void findMaxSum(int[][] matrix) {
        int maximalSum = 0;
        int positionX = 0;
        int positionY = 0;
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int currentSum = checkSum(matrix, i, j);
                if (currentSum > maximalSum){
                    maximalSum = currentSum;
                    positionX = i;
                    positionY = j;

                }
            }
        }
        System.out.println("Sum = " + maximalSum);
        printBestPosition(matrix, positionX, positionY);
    }

    private static int checkSum(int[][] matrix, int x, int y) {
        int sum = 0;
        for (int i = 0+x; i < x+3 ; i++) {
            for (int j = 0+y; j < y+3; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static void printBestPosition(int[][] matrix, int x, int y) {
        for (int i = x; i < x + 3 ; i++) {
            for (int j = y; j < y + 3; j++) {
                System.out.print(matrix[i][j]);
                if (j < y + 2){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
