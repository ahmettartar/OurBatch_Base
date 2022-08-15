package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,5,2,3,1,3};
        List<Integer> listem = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,5,2,3,1,3));

        //Arrays Kullanimi
        int[] arr2 = Arrays.stream(arr).distinct().toArray(); //unique olarak verir
                                    //convert stream to Array
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr2));
        //[1, 2, 3, 4, 5, 6]



        //Collection kullanimi
        List<Integer> listem2 = listem.stream().distinct().collect(Collectors.toList());
                                                        //convert stream to List
        System.out.println(listem2);

        //count
        long sayim = listem.stream().distinct().count();
        System.out.println("Sayim=" + sayim);

        //filter
        List<Integer> filtetliste = listem.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

        System.out.println(filtetliste);

        //skip
        List<Integer> skipListe = listem.stream().skip(4).collect(Collectors.toList());
        //Indexes starts from 1.
        System.out.println("Main Lste" + listem);
        System.out.println("Skip Liste" + skipListe);

        //map
        List<Integer> besliListe = listem.stream().map(e -> e * 5).collect(Collectors.toList());

        System.out.println(besliListe);

        //forEach
        listem.stream().forEach(e->System.out.println(e));
        listem.stream().forEach(System.out::println);

        //match
        boolean b = listem.stream().anyMatch(e -> e % 5 == 0);
        boolean b1 = besliListe.stream().allMatch(e -> e % 5 == 0);
        boolean b2 = listem.stream().noneMatch(e -> e > 100);

        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        
        //JAVA DERSini tamamladik

    }
}
