package collectionFramework.Stack;


import java.util.Stack;

class StringReverser{
    public String reverse(String input){

        // Creating Stack
        Stack<Character> stack = new Stack<>();

        // Store the element convert in to charArray
        for(char ch : input.toCharArray())
            stack.push(ch);

        String reversed = "";

        while (!stack.empty())
            reversed+= stack.pop();

        return reversed;
    }
}


public class ReverseStringUsingStack {
    public static void main(String[] args) {

        String str = "abcd";

        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(str);

        System.out.println("Original String: " + str);
        System.out.println("Reverse String: " + result);
    }
}
