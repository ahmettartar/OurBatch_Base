package day02;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] nums = new int[3]; // 0 0 0 default value
        System.out.println(nums); //I@3f0ee7cb hashCode: int Array[]
        System.out.println("nums[0] = " + nums[0]); //int biriminde.Bir elelement

        nums[0]=5;
        nums[1]=10;
        nums[2]=15;
        //nums[3]=20; //ArrayIndexOutOfBoundsException
        //Array print: nums: Array formatinda
        //Arrays.toString -> convert a String
        System.out.println("Array Numbers: " + Arrays.toString(nums));


        String[] names = new String[3]; // null null null
        System.out.println(names); //hasCode String Array not printed
        System.out.println("names[0] = " + names[0]);//Tek String

        names[0] = "Ahmet";
        names[1] = "Suleyman";
        names[2] = "Hamza";

        System.out.println(Arrays.toString(names));


        System.out.println("===========================");
        int[] sayi = {1,2,3,4,5,6,7,8};//size belirtmeye gerek yok. zaten degerler girilmis.
        System.out.println(Arrays.toString(sayi));

        String[] meslekler = {"Doctor", "Engineer", "Ev Hanimi", "Hemsire"};
        System.out.println(Arrays.toString(meslekler));

        //length() String method
        //length   Array method

        for (int i = 0; i < meslekler.length; i++) {
            System.out.println(meslekler[i]);

        }


        System.out.println("================");
        char[] myChar = meslekler[0].toCharArray();
        System.out.println(Arrays.toString(myChar)); //[D, o, c, t, o, r]


        String s = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String [] days = s.split("day");
       // String [] days = s.split("");
        System.out.println(Arrays.toString(days));
        System.out.println(days.length);

        for (int i = 0; i <days.length ; i++) {
            System.out.println(days[i]);
        }
            System.out.println("=========");

            int[] num = {2,56,200,-30,54,9,34};
            System.out.println("Before" + Arrays.toString(num));
            Arrays.sort(num); //Ascending ABCD Kucukten Buyuge dogru siralar.
        //[-30, 2, 9, 34, 54, 56, 200]
            System.out.println("After" + Arrays.toString(num));

            // Soru: Max ve min bul?
        System.out.println("Min:" + num[0]);
        System.out.println("Max:" + num[ num.length-1 ]);

        //Arrays.equals

        int[] num1 = {2,56,200,-30,54,9,34};
        int[] num2 = {2,56,200,-30,54,9,34};

        System.out.println(Arrays.equals(num1, num2));

        //String.join(":", arrayName) :
        String[] meslekler1 = {"Doctor", "Engineer", "Ev Hanimi", "Hemsire"};
        System.out.println(String.join("<:>", meslekler1));

        // int[] z = Arrays.copyOf(a, a.length);
        String[] meslekCopy = Arrays.copyOf(meslekler1, meslekler1.length);
        System.out.println(Arrays.toString(meslekCopy));


        System.out.println(Arrays.toString(meslekler1));
        System.out.println(Arrays.toString(meslekCopy));
        System.out.println(meslekler1.equals(meslekCopy)); //Herbir object farkli

        //Stringler icin
        // s1==s2 hata verir verir.
        // Primitive data typelar icin kullanilir.

        // s1.equals(s2) PREFERRED
        // Non-primitive/ object icin kullanilir.














    }
}
