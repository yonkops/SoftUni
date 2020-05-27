package minerTask;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resource = new LinkedHashMap<>();
        String input;
        int quantity;
        while (!"stop".equals(input = scanner.nextLine())){
            quantity = Integer.parseInt(scanner.nextLine());
            if (resource.containsKey(input)){
                resource.put(input, resource.get(input) + quantity);
            } else {
                resource.put(input, quantity);
            }
        }
        for (Map.Entry<String, Integer> entry : resource.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
