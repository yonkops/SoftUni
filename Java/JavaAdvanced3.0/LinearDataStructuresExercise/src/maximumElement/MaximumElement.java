package maximumElement;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int commands = Integer.parseInt(scan.nextLine());
        int operationType = 0;
        int number = 0;
        int max = 0;
        String[] input;
        for (int i = 0; i < commands; i++) {
            input = scan.nextLine().split("\\s+");
            operationType = Integer.parseInt(input[0]);
            switch (operationType){
                case 1 :
                    number = Integer.parseInt(input[1]);
                    stack.push(number);
                    break;
                case 2 :
                    if (stack.size() > 0 ){
                        stack.pop();
                    }
                    break;
                case 3 :
                    for (int value : stack) {
                        max = Math.max(value, max);
                    }
                    System.out.println(max);
                    break;
            }
        }
    }
}
