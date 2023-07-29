package collectionFramework.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        /*
        List<String> linkedList = new LinkedList<String>();
        We can create a reference variable of the list, that's not a problem
        but, now we are going to use LinkedList Class
         */
        LinkedList<String> linkedList = new LinkedList<String>();

        System.out.println("Size of LinkedList: " + linkedList.size());

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("JavaScript");

        System.out.println(linkedList);

        linkedList.add(2,"C++");
        linkedList.add(4,"C#");

        System.out.println(linkedList);

        linkedList.remove(2);
        linkedList.remove("JavaScript");

        System.out.println(linkedList);
        System.out.println("Size of LinkedList: " + linkedList.size());

    }
}
