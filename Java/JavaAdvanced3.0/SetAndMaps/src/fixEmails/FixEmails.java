package fixEmails;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> addresses = new LinkedHashMap<>();

        while(true){
            if(input.equals("stop")){
                break;
            }
            String name = input;
            String email = scanner.nextLine();
            if (email.endsWith(".bg")){
                addresses.put(name, email);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry< String, String> entry: addresses.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
