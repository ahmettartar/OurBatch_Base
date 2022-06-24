package day02;

public class StringPractice2 {

    public static void main(String[] args) {

        // 1.Approach
        String str = "Hamza";
        //            01234567     indexes

        //charAt(index)
        System.out.println("str.charAt(0) = " + str.charAt(0));

        String reversed = "";

        reversed += str.charAt(4); //char String e ataniyor. reversed = reversed + str.charAt(4)
        reversed += str.charAt(3);
        reversed += str.charAt(2);
        reversed += str.charAt(1);
        reversed += str.charAt(0);

        System.out.println("reversed = " + reversed);

        //2.Approach
        String ad = "Suleyman";
        //           01234567
        System.out.println("ad.substring(3) = " + ad.substring(3));//baslangic-
        System.out.println("ad.substring(2,5) = " + ad.substring(2, 5)); //[2,5)
        //son harf
        System.out.println("ad.charAt( ad.length()-1 ) = " + ad.charAt(ad.length() - 1));
        System.out.println("ad.substring( ad.length()-1 ) = " + ad.substring(ad.length() - 1));
        System.out.println("ad.substring(-1) = " + ad.substring(20)); //outOFBoubdsException



    }

}
