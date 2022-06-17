package day01;

import jdk.swing.interop.SwingInterOpUtils;

public class LogicalOperator {

    public static void main(String[] args) {
        // AND &&
        // OR II
        System.out.println(5/0);



        System.out.println(5>=2 || 5/0 == 0); // TRUE (execution goes from Left to Right).

        System.out.println(true | 5/0 == 0); // Error (Both side executed)

        System.out.println(false && 5/0 == 0); // FALSE (bir false, false sonuc icin)

    }


}
