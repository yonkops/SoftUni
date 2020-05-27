package phoneBook;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String > phoneBook = new TreeMap<>();
        String[] inputString = scanner.nextLine().split("-");
        String searchedName;

        while (true){
            if (inputString[0].equals("search")){
                break;
            } else {
                phoneBook.put(inputString[0], inputString[1]);
            }
            inputString = scanner.nextLine().split("-");
        }

        searchedName = scanner.nextLine().trim();
        while (!searchedName.equals("stop")){
            if (phoneBook.containsKey(searchedName)) {
                System.out.printf("%s -> %s%n",
                        searchedName, phoneBook.get(searchedName));
            } else {
                System.out.printf("Contact %s does not exist.%n", searchedName);
            }
            searchedName = scanner.nextLine().trim();
        }

    }

}
