package collectionFramework.Stack;

import java.util.Stack;

public class ReverseNumberUsingStackM2 {
    public static int reverseNumber(int number) {
        // Convert the number to a string
        String numStr = Integer.toString(number);

        // Create a stack to store the digits
        Stack<Character> stack = new Stack<>();

        // Push each digit of the string into the stack
        for (int i = 0; i < numStr.length(); i++) {
            stack.push(numStr.charAt(i));
        }

        // Pop the digits from the stack and append them to form the reversed number
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        // Convert the reversed string back to an integer
        int reversedNumber = Integer.parseInt(reversedStr.toString());

        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseNumber(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }

}
