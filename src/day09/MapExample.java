package day09;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(10, "Suleyman");
        map1.put(20, "Mehmet");
        map1.put(30, "Ayse");
        map1.put(null, null);
        map1.put(40, null);
        map1.put(null,"Ahmet"); //updating
        map1.put(100, "Ahmet");
        map1.put(null, null);
        map1.put(100, "Ahmet"); //redundant: 2 taneden birini alir.

        //get(key) method => returns VALUE
        System.out.println("map1.get(10) = " + map1.get(10));

        //Toplu olarak key degerleri almak istersek:
        System.out.println("map1.keySet() = " + map1.keySet());//map1.keySet() = [null, 20, 100, 40, 10, 30]

        //Sadece value degerlerine ulasmak istersek
        System.out.println("map1.values() = " + map1.values());//map1.values() = [null, Mehmet, Ahmet, null, Suleyman, Ayse]

        map1.remove(30);
        System.out.println("Map1: removed Ayse" + map1);
        System.out.println("map1.containsKey(30) = " + map1.containsKey(30));

        System.out.println("map1.containsValue(\"Ahmet\") = " + map1.containsValue("Ahmet"));

//random order
        System.out.println(map1);
        System.out.println("map1.size() = " + map1.size());

        System.out.println("===================");
        //LINKEDHASHMAP
        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(10, "Suleyman");
        map2.put(20, "Mehmet");
        map2.put(30, "Ayse");
        map2.put(null, null);
        map2.put(40, null);
        map2.put(null,"Ahmet"); //not updating
        map2.put(100, "Ahmet");
        map2.put(null, null); //duplicated
        map2.put(100, "Ahmet"); //dupilcated, redundant

        System.out.println(map2);
        //insertion order


        System.out.println("================");
        //HASTABLE
        Map<Integer, String> map3 = new Hashtable<>();
        map3.put(10, "Suleyman");
        map3.put(20, "Mehmet");
        map3.put(30, "Ayse");
        map3.put(40, "Ali");
        //map3.put(null, null); // NullPointerException
        //map3.put(40, null); //NullPointerException
       // map3.put(null,"Ahmet");
        map3.put(100, "Ahmet");
        //map3.put(null, null);
        map3.put(100, "Ahmet");

        //order is not guaranted, random order
        System.out.println(map3);

        //TREEMAP
        Map<Integer, String> map4 = new TreeMap<>();
        map4.put(100, "Ahmet");
        map4.put(10, "Suleyman");
        map4.put(20, "Mehmet");
        map4.put(30, "Ayse");
        //map4.put(null, null);//NullPointerException
        map4.put(40, null);
        //map4.put(null,"Ahmet");
        map4.put(100, "Ahmet");
       // map4.put(null, null);
        map4.put(100, "Ahmet");
        map4.put(40, "James");

        //Order is based on key. Key is not null.
        System.out.println(map4);

    }
}
