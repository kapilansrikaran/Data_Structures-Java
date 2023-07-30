/*
Read two arrays, run the user and generate a third array containing all the common elements from the first two.
*/

package arrays.problems;

public class ProblemTwo {
    public static void main(String[] args) {

    int[] a = {2,5,6,10,12};
    int[] b = {10,6,1,3};

    int[] res = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                     res[j] = a[i];
                }
            }
        }
        for (int num: res) {
            System.out.println(num);
        }

    }
}
