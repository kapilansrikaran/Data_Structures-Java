package string;

public class StringBufferAndStringBuilderExample {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        // StringBufffer class
        StringBuffer buffer = new StringBuffer("Hello ");
        System.out.println(buffer.capacity());
        for (int i = 0; i < 10000; i++) {
            buffer.append("World");

        }
        System.out.println("Time Taken By StringBuffer: " + (System.currentTimeMillis() - startTime) );


        // StringBuilder class
        // lack of thread safety, it cannot be used by multiple threads. That's a major difference

        StringBuilder builder = new StringBuilder("Hello ");
        System.out.println(builder.capacity());
        for (int i = 0; i < 10000; i++) {
            builder.append("World");
        }
        System.out.println("Time Taken By StringBuilder: " + (System.currentTimeMillis() - startTime) );

    }
}

/*
Note:
Performance test (Time taken)
 StringBuffer will take more time as compared to the StringBuilder
 because StringBuilder, although it's unsafe to use for the multi-threading, but it is the fastest among all the mutability
 and does not allow multiple threads operations at the same time. That's why it is faster as compared to the StringBuffer.
 */
/*
More To Learn...
StringBuffer Class in Java
https://www.geeksforgeeks.org/stringbuffer-class-in-java/

StringBuilder in Java
https://www.javatpoint.com/StringBuilder-class

Difference between StringBuffer and StringBuilder
https://www.geeksforgeeks.org/difference-between-stringbuffer-and-stringbuilder-in-java/
 */