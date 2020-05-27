package basicStackOperations;

import java.util.Scanner;
import java.util.Stack;

public class BasicStackOperations {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int pushNum = Integer.parseInt(input[0]);
        int popNum = Integer.parseInt(input[1]);
        int searchNum = Integer.parseInt(input[2]);

        input = scanner.nextLine().split("\\s+");
        for (int i = 0; i < pushNum; i++) {
            stack.push(Integer.parseInt(input[i]));
        }

        while (!stack.isEmpty() && popNum > 0){
            stack.pop();
            popNum--;
        }

        if (stack.contains(searchNum)){
            //Printing True
            System.out.println(stack.contains(searchNum));
        } else {
            if (stack.size() > 0){

                System.out.println(stack.peek());
            }else{
                // If stack is empty print 0
                System.out.println("0");
            }

        }

    }

}

