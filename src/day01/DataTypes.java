package day01;

public class DataTypes {

    public static void main(String[] args) {


        int a = 5;
        a = 10; //reassigning

        double b = 3.5;
        boolean isValid = true;
        char ahmet = 'c'; // ''Single Quote

        String firstName = "ali"; // Cok kullanacagiz. "" Double Quote

        int aa, bb, cc; //just declaring
        int i,j,k = 0; //toplu assign NOT PREFERRED
        aa = 1;
        bb = 2;
        cc = 3;

       // int k, String z; // ERROR (Ayni satir ayni birimde olmalidir.)

        float aal = 123F; // default int gibi alir
        float aav = 0.55F; // olursa float number alir
        System.out.println(aal);

        long bbo = 1234; // default int gibi alir
        long bbf = 12059696L;

        int abc = 120_000; // 120000 gibi aliyor. Easy to read this way.
        System.out.println(abc);


    }

}
