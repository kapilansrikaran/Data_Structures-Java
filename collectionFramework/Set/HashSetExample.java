package collectionFramework.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        /*
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        System.out.println(numbers);


        Iterator<Integer> iterate = numbers.iterator();
        while (iterate.hasNext())
            System.out.println(iterate.next());


        System.out.println(numbers.remove(400));
        System.out.println(numbers.removeAll(numbers));
        */

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(100);
        set2.add(200);
        set2.add(300);
        set2.add(400);
        set2.add(500);

        // union Set
//        set1.addAll(set2);
//        System.out.println(set1);

        // Intersection Set
//        set1.retainAll(set2);
//        System.out.println(set1);

        // Not common element in both
        set2.removeAll(set1);
        System.out.println(set2);


    }
}
