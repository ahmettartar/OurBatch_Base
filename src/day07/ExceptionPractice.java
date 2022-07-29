package day07;

public class ExceptionPractice {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(arr1[2]);

        System.out.println(arr1[3]); //unchecked exception
        // Runtime yapinca Exception oldugunu anladik.

        String obj1 = ""; //StringIndexOutOfBoundsException

        //String obj1 = null;
        //System.out.println(obj1.charAt(0)); //NullPointerException
        //Unchecked exception
        // RUNTIME yapinca gorduk.


        // CHECKED EXCEPTION
        //String isim = 15; //check exception
        //Compile time da bunu gorduk.
        //We must handle it.


        //String a = null;
       // System.out.println(a.charAt(0));
        // hata verdikte sonra program akisi durur.


        try {
            //String a = "Java";
            String a = null;
            System.out.println(a.charAt(0));

        }catch (RuntimeException e){
            e.getMessage();
            e.printStackTrace();

        }

        //try catch hatayi yakalar, bilgisini verir.
        // Tekrar program akisi devam eder.

        System.out.println("Program akisi hatadan sonra devam etti.");




    }
}
