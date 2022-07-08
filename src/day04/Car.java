package day04;

public class Car {
    //instance variable
    String marka;
    String model;
    String renk;
    boolean isManual;
    int year;

    //instance method
    public void buying(){
        System.out.println("Yeni bir araba aldiniz.");
    }

    public void selling(){
        System.out.println("Arabanizi satiyorsunuz");
    }

    //static metod
    public static void staticDeneme(){
        System.out.println("Statik metod calisiyor.");
    }



    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", isManual=" + isManual +
                ", year=" + year +
                '}';
    }
}
