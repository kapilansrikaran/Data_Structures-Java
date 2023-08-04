package collectionFramework.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<String, Integer> number = new TreeMap<>();

        number.put("One", 1);
        number.put("Two", 2);

        System.out.println(number);
        System.out.println(number.firstKey());
        System.out.println(number.lastKey());
        System.out.println(number.remove("One"));
    }
}
