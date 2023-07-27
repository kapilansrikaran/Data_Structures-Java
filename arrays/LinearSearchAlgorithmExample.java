/*
* Given an array and a key value as input, find the index of key in array.
* Return -1 It is not present
*/

package arrays;

import java.util.Scanner;

public class LinearSearchAlgorithmExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input array size
        int n = scan.nextInt();

        //input integer array element
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        //input the search element
        int key = scan.nextInt();

        int ans = -1;

        //Iterate over the array and update ans if key is found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                ans=i;
                break;
            }
        }
        System.out.println(ans);

        // Iterates right to left and returns the last occurrence
        for (int i = n-1; i > 0; i--) {
            if (arr[i] == key) {
                ans=i;
                break;
            }
        }
        System.out.println(ans);

    }
}
// Sample input test case for check both Iteration: 1 2 2 2 5 6
