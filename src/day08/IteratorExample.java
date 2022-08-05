package day08;

import java.util.*;

public class IteratorExample {
        public static void main(String[] args) {

            List<String> names = new ArrayList<>();
            names.add("james");
            names.add("emre");
            names.add("bruce");
            System.out.println(names); //[james, emre, bruce]

            Iterator<String> it = names.iterator();

            System.out.println(it.next()); // move the pin, and return the element
            //james
            System.out.println(it.next()); // move the pin, and return the element
            //emre
            System.out.println(it.next()); // move the pin, and return the element
            //bruce
            // System.out.println(it.next()); // there was no 4th element, so exception happened

            // Set ORNEGI
            Set<String> set1 = new HashSet<>();
            set1.add("ayse");
            set1.add("ali");
            set1.add("osman");
            set1.add("fatma");

            Iterator<String> itset = set1.iterator();
            System.out.println(itset.next());
            System.out.println(itset.next());
            System.out.println(itset.next());
            System.out.println(itset.next());
            //System.out.println(itset.next()); //veri yok. NoSuchElementException



        }
    }


