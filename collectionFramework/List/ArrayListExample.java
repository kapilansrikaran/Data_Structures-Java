package collectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // list of string that's being initialized with ArrayList.
        List<String> list = new ArrayList<String>();
        list.add("King");
        list.add("Sarah");
        list.add("Kamal");

        System.out.println("Size of ArrayList: " + list.size());

        System.out.println(list);

        // remove the element
        list.remove(0);

        for (String value: list) {
            System.out.println(value);
        }

    }
}
