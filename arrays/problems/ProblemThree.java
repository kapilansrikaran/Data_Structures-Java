/*
Given an array, find the maximum and minimum elements in it.
 */

package arrays.problems;

public class ProblemThree {
    public static void main(String[] args) {
        int[] arr = {10,5,2,12,0};

        int min= arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(min >= arr[i]){
                min = arr[i];
            }
            else{
                max= arr[i];
            }

        }

        System.out.println(min +", "+ max);
    }
}
