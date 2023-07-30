/*
* Given an integer N, generate and print an array containing squares of all numbers from i to N
*/

package arrays.problems;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] squarArry = new int[N];

        for (int i = 0; i < squarArry.length; i++) {
            squarArry[i] = (i+1)*(i+1);

        }

        for(int num : squarArry){
            System.out.print(num + "\t" );
        }
    }
}
