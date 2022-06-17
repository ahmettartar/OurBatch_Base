package day01;

import java.util.Scanner;

public class ScannerMethod {

    public static void main(String[] args) {

        //String firstName = "Ahmet"; // hardcoding

        // Consoldan bilgi girmek istersek;

        //dymanic entering

        Scanner input = new Scanner (System.in);
    /*
    nextByte()   ---> return input as a byte.
nextShort()
nextInt()**
nextLong()
nextFloat()
nextDouble()**
nextBoolean()

     */
//next() : read the input only until a space (James Bond -->James) RETURN: String
//nextLine() : Read the entire input/multiple word.

        System.out.println("Adinizi giriniz?");
        String firstName = input.nextLine();
        System.out.println("Adiniz: " + firstName);

        System.out.println("Okul adini giriniz?");
        String schoolName = input.nextLine();
        System.out.println("Okulunuz: " + schoolName);

        System.out.println("Yasinizi giriniz?");
        int yourAge = input.nextInt();
        System.out.println("Yasiniz: " + yourAge);

        //int a = "123"; Return int ---> input: String

        System.out.println("Adinizi giriniz?");
        String firstName1 = input.next();
        System.out.println("Adiniz: " + firstName1);

        input.nextLine(); // "enter"i absorbe etsin diye
        System.out.println("Tost fiyatini giriniz?");
        double tostFiyati = input.nextDouble();
        System.out.println("Yasiniz: " + tostFiyati);





    }







}
