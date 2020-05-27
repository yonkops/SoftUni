package uniqueUsernames;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet <String> uniqueUsers = new LinkedHashSet<>();
        int numberOfUsers = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfUsers ; i++) {
            String userName = scanner.nextLine();
            uniqueUsers.add(userName);
        }
        for (String name : uniqueUsers){
            System.out.println(name);
        }
    }
}
