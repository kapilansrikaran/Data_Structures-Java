package collectionFramework.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> evenNumber = new LinkedHashMap<>();

        evenNumber.put("One", 1);
        evenNumber.put("Two", 2);
        System.out.println(evenNumber);

        LinkedHashMap <String, Integer> number =new LinkedHashMap<>(evenNumber);
        number.put("Three",3);
        System.out.println(number);

        number.put("Three",3);
        number.putIfAbsent("Four",4);
        System.out.println(number);
    }
}
