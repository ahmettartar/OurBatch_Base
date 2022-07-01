package day03;

public class CustomMethodPractice {

    public static void main(String[] args) {
        //System.out.println("Merhaba");
        // calling
        selamlama();
        selamKisi("hamza");// Ahmet: argument
        // String name = "Ahmet";

    }

    public static void selamlama(){
        System.out.println(" Java dersine hosgeldiniz");

    }

    public static void selamKisi(String name){// String Name: Parameter
        System.out.println("Hosgeldin : " + name);

    }





}
