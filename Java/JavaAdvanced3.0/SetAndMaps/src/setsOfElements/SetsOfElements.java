package setsOfElements;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> nSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> mSet = new LinkedHashSet<>();

        int sizeN = scanner.nextInt();
        int sizeM = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < sizeN; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            nSet.add(input);
        }
        for (int i = 0; i < sizeM; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            mSet.add(input);
        }
        for (int number : nSet) {
            if (mSet.contains(number)){
                System.out.print(number + " ");
            }
        }

    }
}
