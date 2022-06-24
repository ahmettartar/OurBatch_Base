package day02;

public class StringPractice3 {
    public static void main(String[] args) {
        String str = "Hamza";
        System.out.println("str.indexOf(\"H\") = " + str.indexOf("H"));
        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a")); //first occurence
        System.out.println("str.indexOf(\"k\") = " + str.indexOf("k")); //yoksa -1

        System.out.println("str.indexOf(\"Ham\") = " + str.indexOf("Ham"));//Eslesince H'nin sonucunu verir

        System.out.println("str.indexOf('H') = " + str.indexOf('H')); //' Chracter

        String s = "definition i love you";
        System.out.println("s.indexOf('i', 4) = " + s.indexOf('i', 4)); //Starting point  -->5
        //index 4: n Bu harften sonrasina bakar.
        //(i harfi arar. starting point: 4 --> 4.indexten sonra aramaya baslar).


        //lastIndexOf() Sondan bakmaya baslar. Right to Left
        System.out.println("s.indexOf('i') = " + s.indexOf('i'));
        System.out.println("s.lastIndexOf('i') = " + s.lastIndexOf('i'));

        //replace()
        System.out.println("s.replace('i', 'a') = " + s.replace('i', 'a')); // old value, new value
        System.out.println("s.replaceFirst('i', 'x') = " + s.replaceFirst("i", "a")); //Sadece String alir.
        //first occurence da islem yapar.

        // String "A"
        //char 'c'



    }


}
