package day10;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
//Functional Interface
        Predicate<Integer> isOdd = e -> e%2 !=0;

        boolean sonuc = isOdd.test(101); //true
        boolean sonuc1 = isOdd.test(10);
        System.out.println(sonuc);
        System.out.println(sonuc1);


        //normal yoldan bir integerin tek mi cift mi olduguna bakalim.
        System.out.println(tekMiCiftMi(25));

        //Polindrome
        // racecar -> (REVERSE) racecar
        //nanan

    }

    public static boolean tekMiCiftMi(int sayi) {
//        if(sayi%2!=0){
//            return true;
//        }else{
//            return false;
//        }
        return (sayi%2!=0);
    }

}
