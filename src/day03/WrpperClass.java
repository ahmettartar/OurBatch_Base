package day03;

public class WrpperClass {

    public static void main(String[] args) {
        int a = 30;
        String x = "Ahmet";
        double pi = 3.14;

        //Wrapper
        Integer aa = 10; //10->int AUTOBOXING
        // aa=10 Integer Object
        Double bb = 10.5; //10.5 double(primitive)
        //bb Double Object

        // Object-> primitive
        int cc = aa;// aa:Integer object -> int (primitive) UNBOXING
        double dd = bb;


        //Methods
        // Integer.parseInt("String Number")
        Integer.parseInt("200"); // 200 int (primitive)

        Double.parseDouble ("20.2"); // 20.2 double (primitive)

        //Java Value
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);

        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);

        //valueOf Method
        int abc = Integer.parseInt("15"); // return int 15

        Integer bbb = Integer.valueOf("20"); // return Integer Object 20 (wrapper)

        String s1= String.valueOf(30); // 30 int --> String 30'a convert etti.

    }









}
