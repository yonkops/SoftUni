package countSymbols;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split("");
        Map<String, Integer> countSymbols = new TreeMap<>();

        for (String i : inputString) {
            if (countSymbols.containsKey(i)){
                countSymbols.put(i, countSymbols.get(i) + 1);
            } else {
                countSymbols.put(i, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : countSymbols.entrySet()) {
            System.out.printf("%s: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
