package day02;

import java.util.Locale;

public class StringPractice {

    public static void main(String[] args) {

        String isim;//declaring
        isim= "Ahmet"; // Assigning //immutable, can not be changed
        String isim1 = "Ahmet";
        isim = "Niyazi";

        System.out.println(isim);
        System.out.println(isim1);

        System.out.println("=================");

        System.out.println(isim==isim1); //true
        int num1 = 5;
        int num2 =10;
        System.out.println(num1>=num2);

        // New Keyword
        String isim2 = new String("Ahmet");
        System.out.println(isim1==isim2);//false. Memory locationlari farkli.

        System.out.println("====================");
        String str = "Today is Java day";
        String str1 = "Today is Java day";
        System.out.println(str==str1);

        // equals method TAM ESLESME
        System.out.println("str.equals(str1) = " + str.equals(str1));//true


        //equalsIgnoreCase()
        System.out.println("str.equalsIgnoreCase(str1) = " + str.equalsIgnoreCase(str1));//true

        //length()
        System.out.println("isim.length() = " + isim.length());
        System.out.println("isim1.length() = " + isim1.length());

        //toUpperCase() toLowerCase
        System.out.println("isim.toLowerCase() = " + isim.toLowerCase());
        System.out.println("isim.toUpperCase() = " + isim.toUpperCase());

        // startsWith() endsWith
        System.out.println("Isim:" + isim);
        System.out.println("isim.startsWith(\"N\") = " + isim.startsWith("N"));
        System.out.println("isim.startsWith(\"N\") = " + isim.startsWith("n"));
        System.out.println("isim.startsWith(\"N\") = " + isim.startsWith("Niy"));
        System.out.println("isim.startsWith(\"N\") = " + isim.startsWith("Niyazi"));

        System.out.println("isim1 = " + isim1);
        System.out.println("isim1.endsWith(\"et\") = " + isim1.endsWith("et"));
        System.out.println("str.endsWith(\"day\") = " + str.endsWith("va day"));

        //contains()
        System.out.println("str = " + str);
        System.out.println("str.contains(\"Java\") = " + str.contains("Java"));

        //trim()
        String abc = "   Hamza Loves Java    ";
        System.out.println("abc.length() = " + abc.length());
        System.out.println("abc.toLowerCase() = " + abc.toLowerCase());
        System.out.println("abc.toUpperCase() = " + abc.toUpperCase());

        System.out.println("abc.trim() = " + abc.trim());
        System.out.println("abc = " + abc);
        //NOTTT!!!
        abc = abc.trim();//reassigning yapilmasi gerekli.
        System.out.println("abc = " + abc);

        //isEmpty()  isBlank
        String a = "ABC"; //nothing, null
        System.out.println("a" + a);
        String b = "            ";
        System.out.println("b" + b);
        System.out.println("a.isEmpty() = " + a.isEmpty());
        System.out.println("b.isEmpty() = " + b.isEmpty());

        //Blank String icerisinde sadece bosluk karakteri olmasina bakar: Bosluk karakteri
        System.out.println("a.isBlank() = " + a.isBlank());
        System.out.println("b.isBlank() = " + b.isBlank());


    }
}
