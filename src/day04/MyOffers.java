package day04;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer first = new Offer("Google", "Texas", 200_000, true, 15); // creating an Offer object
        //System.out.println(first);

        //ArrayList<String> ar1 = new ArrayList<>(); //Bos Array List
        //ar1.add("Mehmet")
        //String a = new String("Ahmet");


        ArrayList<Offer> allOffers = new ArrayList<>(); // creating an ArrayList


        //that will hold Offer objects
        allOffers.add(first); // added the first Offer object to the ArrayList

        // !!! allOffers.add(Arrays.asList(first)); It does not work.
        //or
        //2.way
        //ArrayList<Offer> allOffers = new ArrayList<>(Arrays.asList(first));
        //

        allOffers.add( new Offer("Amazon", "New York", 180_000, true, 15) ); //2.objct
        //creating an Offer object and
        // added to the ArrayList

        System.out.println(allOffers);

        System.out.println();

        //Array Yapisi
        //String [] names = {"Ahmet", "Ali", "Kerim"};

        Offer [] moreOffers = { //3 tane daha offer
                new Offer("Apple", "Chicago", 230_000, false, 10),
                new Offer("Tesla", "Texas", 250_000, false, 20),
                new Offer("Facebook", "Florida", 120_000, true, 10)
        }; // created an array of Offer objects


        allOffers.addAll(Arrays.asList(moreOffers)); // added the array of Offers
        //into the ArrayList of offers
        //System.out.println(allOffers);


        //2 tane ekliyoruz.
        //String [] abc = { new String (A,b,c), new String (D,E,F)}

        allOffers.addAll(Arrays.asList(
                new Offer("Discord", "Chicago", 150_000, false, 13),
                new Offer("Netflix", "Canada", 170_000, true, 12)
        )); // added Offer objects using the var args of the asList method to add
        //multiple Offer
// objects at the same time
        System.out.println();
        System.out.println(allOffers); //tum objecctler gorulur- 7 tane



        //ISLEMLER

// create ArrayLists to filter the Offers
        ArrayList<Offer> salaries = new ArrayList<>(allOffers); //copy etmis olduk allOffers arrayList

        salaries.removeIf( e -> e.salary < 170_000); //lambda expression

        System.out.println("Salaries above 170,000");

        System.out.println(salaries);

        System.out.println();

        //diger bir islem

        ArrayList<Offer> fullTime = new ArrayList<>(allOffers); //copy olusturduk
        //!false ->true
        fullTime.removeIf( each -> !each.isFullTime); // Contract olanlar veya fullTime olmayanlar
                                    // each.isFullTime == false
        System.out.println("Only full time offers");
        System.out.println(fullTime);
    }
}
