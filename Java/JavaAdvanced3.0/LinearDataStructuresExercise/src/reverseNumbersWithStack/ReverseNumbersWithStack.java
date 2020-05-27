package reverseNumbersWithStack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque <Integer> stack = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");

        for (int i = 0; i < input.length ; i++) {
            stack.push(Integer.parseInt(input[i]));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

    }
}
