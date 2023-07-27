package arrays;

import java.util.Scanner;

public class LinearSearchAlgorithmWithForeachLoopExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {5,8,3,6,9};

//        for (int num: arr) {
//            System.out.print(num + " multiply is " );
//            System.out.print(num*num + "\n");
//        }

        // check whether the given key value is present inside my array
        System.out.print("Enter the Search Number: ");
        int key = scan.nextInt();
        boolean found = false;

        for(int num: arr){
            if(num == key){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println(key+ " is Found");
        }else{
            System.out.println(key + " is Not Found");
        }


    }
}
