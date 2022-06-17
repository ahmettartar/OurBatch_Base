package day01;

public class FizzBuzz {
    public static void main(String[] args) {
        //FizzBuzz
        int sayi = 18;
        if(sayi%3==0 && sayi%5==0 ){
            System.out.println("FizzBuzz");
        }else if(sayi%3==0){
            System.out.println("Fizz");
        }else if(sayi%5==0){
            System.out.println("Buzz");
        }

       // System.out.println();


    }
}
