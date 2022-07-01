package day03;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {
        //1.yol
        ArrayList<String> listOne = new ArrayList<>();//bos Arraylist
        listOne.add("hello");
        listOne.add("bye");
        listOne.add("Merhaba");
        System.out.println(listOne);

        //2.yol
        ArrayList<String> listTwo = new ArrayList<>( listOne ); // adds the elements
        //from the listOne ArrayList into the ListTwo
        listTwo.add("Hola");
        listTwo.add("Selam");
        System.out.println(listOne);
        System.out.println(listTwo);

        //3.yol
        ArrayList<String> listThree = new ArrayList<>( Arrays.asList("one", "two",
                "three") );
        System.out.println(listThree);
//ArrayList<String> listFour = new ArrayList<>("four", "five", "six"); not valid
    }
}
