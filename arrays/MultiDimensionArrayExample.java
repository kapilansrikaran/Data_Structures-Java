package arrays;

public class MultiDimensionArrayExample {
    public static void main(String[] args) {
        /* Store 5 different subject marks for 3 different students */
         // int[][] arr = new int[5][3] // 5 row and 3 column

        int[][] marks = {
                {65,85,98,32,98},
                {68,89,56,56,95},
                {54,65,65,56,98}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }



    }
}
