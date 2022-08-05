package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorLooping {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                2, 3, 5, 6, 12, 6, 35, 6, 2, 5, 6, 2, 3, 1, 4, 5
        ));

//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i) < 5){
//                list.remove(i);
//            }
//        }
//
//        System.out.println(list);

        // ilk durumda 2, 3, 5, 6, 12, 6, 35, 6, 2, 5, 6, 2, 3, 1, 4, 5  => 2 ->0.ondex
        // ilk durumda 3, 5, 6, 12, 6, 35, 6, 2, 5, 6, 2, 3, 1, 4, 5  => 3 ->0.index oldu
        // for dongusu 1.indexten devam ediyor. 5 handle eder.
        //her defasinda list seklimiz/formatimiz (size) degisitiginden elemanlar iskalaniyor.

//        // traditional loop with removing doesn't, but because indexs/elements get shifted, so it could skip some elements
//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i) < 5){
//                list.remove(i);
//            }
//        }




        // for each
//        for(int each : list){
//            if(each < 5){
//                list.remove(each);
//            }
//        }
//        System.out.println(list); //ConcurrentModificationException

        // removing in a for each loop is also not valid, because we cannot change the size of the arraylist/collection when looping in for each loop
//        for(int each : list){
//            if(each < 5){
//                list.remove(each);
//            }
//        }



        // SOLUTION

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){ // checks if there is an element next to it, if not stop the loop
            if(it.next() <= 5){ // move to the next element and then return it
                it.remove(); // removing the element from the list
            }
        }
        // [6, 12, 6, 35, 6, 6]


        System.out.println(list);




// Ayrica Lambda expression ile de cozebiliriz.

        System.out.println("LAMBDA EXPRESSiON");

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(
                2, 3, 5, 6, 12, 6, 35, 6, 2, 5, 6, 2, 3, 1, 4, 5
        ));

            list1.removeIf(e-> e<=5);
            System.out.println(list1);

        }

        //LAMBDA EXPRESSiON
        // [6, 12, 6, 35, 6, 6]

    }