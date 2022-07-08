package day04;

public class UsingStudent {

    public static void main(String[] args) {

        Student ogrenci = new Student();

        ogrenci.name = "Ayse";
        ogrenci.age = 15;

        System.out.println(ogrenci);

        ogrenci.study();

        System.out.println("ogrenci.yasiniz(10) = " + ogrenci.yasiniz(6));


    }


}
