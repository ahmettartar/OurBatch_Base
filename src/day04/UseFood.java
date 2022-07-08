package day04;

public class UseFood {

    public static void main(String[] args) {

        Food f1 = new Food("Sogan", "Fanta", 1);
        System.out.println(f1);

        //Reassinging yaptik.
        f1.sebze = "Patates";
        f1.icecek = " Soda";
        f1.kilo = 3;

        System.out.println(f1);

        Food f2 = new Food("sogan");
        System.out.println(f2);



    }
}
