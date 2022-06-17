package day01;

public class BigNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 80;

        if (a>=b && a>=c){
            System.out.println(a + " is the biggest");

        }else if (b>=a && b>=c){
            System.out.println(b + " is the biggest");

        }else{

            System.out.println(c + " is the biggest");
        }

        //Ternary
        System.out.println( (a>=b && a>=c) ? "condition1" : (b>=a && b>=c) ? "condition2" : "Fail"  );
    }
}
