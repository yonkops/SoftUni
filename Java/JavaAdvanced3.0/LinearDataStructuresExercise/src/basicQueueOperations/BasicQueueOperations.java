package basicQueueOperations;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int addedNum = Integer.parseInt(input[0]);
        int removedNum = Integer.parseInt(input[1]);
        int searchNum = Integer.parseInt(input[2]);
        int minNumber = Integer.MAX_VALUE;

        input = scanner.nextLine().split("\\s+");
        for (int i = 0; i < addedNum; i++) {
            queue.add(Integer.parseInt(input[i]));
        }

        while (!queue.isEmpty() && removedNum > 0){
            queue.remove();
            removedNum--;
        }

        if (queue.contains(searchNum)){
            //Printing True
            System.out.println(queue.contains(searchNum));
        } else {
            if (!queue.isEmpty()){
                while (!queue.isEmpty()){
                    if (minNumber > queue.peek()){
                        minNumber = queue.peek();
                    }
                    queue.remove();
                }
                System.out.println(minNumber);
            }else{
                // If queue is empty print 0
                System.out.println("0");
            }

        }

    }

}

