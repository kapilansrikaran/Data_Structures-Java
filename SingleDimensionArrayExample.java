public class SingleDimensionArrayExample {
    public static void main(String[] args) {

        /* Declaring an array */
        // int[] marks;
        // marks = new int[5];
        /* or */
        //int[] marks = new int[5];

        /* Initializing an array */
        //int[] marks = new int[] {10,20,30,40,50};


        //Declare and Assign
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 78;
        marks[3] = 85;
        marks[4] = 90;

        /* Output Method 1 - for loop */
        for (int i=0; i< marks.length; i++){
            System.out.println(marks[i]);
        }

        /* Output Method 2 - foreach loop*/
        for(int value:marks){
            System.out.println(value);
        }


    }
}
