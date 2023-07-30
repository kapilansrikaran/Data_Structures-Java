package collectionFramework.Stack;

import java.util.Stack;

class ReverseInteger{
    public int reverse(int input){

        Stack<Integer> stack = new Stack<>();

        while(input != 0){
            stack.push(input % 10);
            input = input /10;
        }

        System.out.println(stack);

        int reverse = 0;
        int i = 1;


        while (!stack.isEmpty())
        {
            reverse = reverse + (stack.pop() * i);
            i = i * 10;
        }


        return reverse;
    }
}

public class ReverseNumberUsingStackM1 {
    public static void main(String[] args) {
        int number = 12345;

        ReverseInteger reverseNum = new ReverseInteger();
        int result = reverseNum.reverse(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reverse Number: " + result);

    }
}
