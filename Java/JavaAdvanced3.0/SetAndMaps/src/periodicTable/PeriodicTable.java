package periodicTable;

import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        TreeSet<String> periodicTable = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int inputsNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < inputsNumber; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int j = 0; j < input.length; j++) {
                periodicTable.add(input[j]);
            }
        }
        for (String element: periodicTable) {
            System.out.print(element + " ");
        }
    }
}
