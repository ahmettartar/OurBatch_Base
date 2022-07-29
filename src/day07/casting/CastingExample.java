package day07.casting;

public class CastingExample {
    public static void main(String[] args) {
        Telefon tel1 = new Iphone();  //every iphone is telefon
        //upcasting, implicityly: Automatically
        Samsung sam1 = new Samsung();
        Telefon tl2 = sam1;


        //Downcasting

        //Samsung sam2 = tel1; // her telefon is samsung.
        // Dog dog = animal1; // her animal is dog.
        Samsung sam2 = (Samsung) tel1; //her telefon ki samsung olani, samsungdur.

        Iphone iphone2 = (Iphone) tel1;


        // Dog dog = (Dog)animal1; // her animal ki dog olani, is dog.

        // Torun Baba Dede
        /*

        polymophisim 3lu referans
        Dede torun1 = new Torun();
        Baba torun2 = new Torun();
        Torun torun3 = new Torun();

        Dede dede1 = new Dede();
        Torun torun5 = dede1; // Dede bir torundur. HATALI : ASIL BIREY :DEDE

        Torun torun5 = (Torun)dede1; //Dedenin torunu, torundur. ASIL BIREY: TORUN



         */








    }

}

class Telefon{

}

class Iphone extends Telefon{

}

class Samsung extends Telefon{

}
