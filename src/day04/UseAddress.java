package day04;

public class UseAddress {
    public static void main(String[] args) {

        Address adr1 = new Address("9239 Amberglen Blvd", "Austin", "Texas",
                "78729");

        System.out.println(adr1);

//Eger bos constructor olusturursak;
        Address adr2 = new Address();
        System.out.println(adr2); //simdi default degerleri alir.
//Diger durumlarda argumentlar otomatik olarak this keyword ile
        //akatirlmaktadir.
    }
}
