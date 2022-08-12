package day09;

import java.util.*;

public class MapProblem1 {

    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<>(Arrays.asList(
                1,1,3,6,3,9,12,6,5,5,0,2
        ));

        System.out.println(list1);

        // Question
        //Listeyi, bir tane element sayisi olanlari yazdir.
        //No dupliates
        //Set<Integer> set1= new HashSet<>(list1);
        Set<Integer> set1= new TreeSet<>(list1);
        System.out.println(set1);




    }
}
