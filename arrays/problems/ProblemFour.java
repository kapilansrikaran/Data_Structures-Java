/*
Given an array, generate a new array that is reverse of it.
 */

package arrays.problems;

public class ProblemFour {
    public static void main(String[] args) {
        int[] arr = {10,2,5,0,7};
        int j =0;
        int size = arr.length;

        int[] revArray = new int[5];
        for (int i = size-1; 0 <=i ; i--) {
            while(true){
                revArray[j]=arr[i];
                j=j+1;
                break;
            }
        }
        for (int num: revArray
             ) {
            System.out.println(num);
        }
    }
}
