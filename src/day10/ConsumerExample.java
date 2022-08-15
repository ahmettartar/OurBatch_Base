package day10;

import java.util.function.Consumer;

public class ConsumerExample {

    //Functional Interface
    public static void main(String[] args) {
        Consumer<int[]> sayilariYazdir = each->{
            for (int sayi : each) {
                System.out.println(sayi);
            }

        };

        int[] array = {1,5,9,34,23};
        sayilariYazdir.accept(array);
    }
}
