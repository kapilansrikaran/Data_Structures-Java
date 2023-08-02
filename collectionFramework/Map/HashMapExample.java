package collectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(100,"Jaffna");
        map.put(101,"Colombo");
        map.put(102,"Matara");
        map.put(103,"Kandy");
        map.put(104,"Galle");

        System.out.println(map);

        for(Map.Entry<Integer , String > m : map.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        System.out.println(map.get(100));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.remove(101));
        map.clear();
        System.out.println(map);

    }
}
