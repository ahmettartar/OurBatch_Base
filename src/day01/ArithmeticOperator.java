package day01;

import java.sql.SQLOutput;

public class ArithmeticOperator {
    /*
    (10/2) --> 2 (default int)

	(10.0/2) --> 2.00 (double)
	(int(10.5)/2) --> 5 (int)
One Rule: short/byte
		short a = 5;
		byte b = 2;
		c = a+b; ---> int (it is the rule in java).
     */

    public static void main(String[] args) {

        int a = 5;
        int b = 2;
        double c = (1.00)*a/b;
        //double c = *a/b;

        System.out.println("a+b= " + (a+b));
        System.out.println("a-b = " + (a-b)); //a-b.soutv ENTER
        System.out.println(" Remainder = " + (a%b));
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(c);

    }
}
