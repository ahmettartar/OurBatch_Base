package day05.b;

import day05.a.first;

public class third extends first {
    public static void main(String[] args) {
        first f1 = new first();
        //f1.a; default, sadece ayni package icinde kullanilabilir
        System.out.println("f1.d = " + f1.d);

        third t3 = new third(); //child class
        System.out.println("t3.c = " + t3.c);


    }

}
