package day04;

public class UsingCar {

    public static void main(String[] args) {

        //
        Car mercedes = new Car();
        //Car classindan mercedes adinda bir object olusturduk

        mercedes.marka = "Mercedes";
        mercedes.model = "CLX";
        mercedes.renk = "Siyah";
        mercedes.isManual = false; //otomatik
        mercedes.year = 2022;

        System.out.println(mercedes); //day04.Car@75bd9247 hashcode
        //Car{marka='Mercedes', model='CLX', renk='Siyah', isManual=false, year=2022}

        System.out.println(mercedes.marka);
        System.out.println(mercedes.renk);

        Car.staticDeneme(); //static method Static classa aittir

        mercedes.buying();
        mercedes.selling();

        //mercedes.staticDeneme(); //Ulasabilirsiniz. NOT PREFERED. Programcilar kullanmaz.



        Car toyota = new Car();
        System.out.println(toyota);
        // Deger vermedigimiz zaman default deger atar.
        toyota.marka = "Toyota";
        System.out.println(toyota);
        toyota.year = 2022;
        System.out.println(toyota);




    }
}
