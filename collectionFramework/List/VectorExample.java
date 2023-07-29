package collectionFramework.List;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        System.out.println("Size of Vector: " + vector.size());

        vector.add("Programming");
        vector.add("Networking");
        vector.add("Database");
        vector.add("CyberSecurity");
        vector.add("Cloud");

        System.out.println(vector);

        System.out.println("Size of Vector: " + vector.size());

        vector.remove(0);

        System.out.println("Size of Vector: " + vector.size());

        vector.clear();

        System.out.println(vector);

        System.out.println("Size of Vector: " + vector.size());


    }
}
