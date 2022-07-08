package day04;

public class StaticVariables {
    //instance variable
    String name;
    int age;

    //Static variable
    static String schoolName = " ABC";
    static double PISAYISI = 3.14159;
    static int para = 100;

    //instance method
    public void eat(){
        System.out.println(name + " is eating.");
    }

    //static method
    public static void okulAdi(){
        //Statik variable lar sadece kullanilir
        System.out.println("Okul Adi:" + schoolName); //Static variable
        //System.out.println(name);
        //name instance variable, dolayisiyla static yapi icerisinde yeri yok.

    }



    public StaticVariables(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StaticVariables{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
