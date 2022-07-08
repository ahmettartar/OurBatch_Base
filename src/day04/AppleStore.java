package day04;

import day03.MethodWithReturn;
import day03.StringUtil;

public class AppleStore {
    public static void main(String[] args) {

        MyIphone phone1 = new MyIphone("iphone X", 1000);
        System.out.println(phone1);


        MyIphone phone2 = new MyIphone("Iphone 11", 1200);
        System.out.println(phone2);


        System.out.println(phone1.company); //not prefered
        System.out.println(phone2.os); //not prefered
        //Bunun yerine call through className
        System.out.println("MyIphone.company = " + MyIphone.company);


        //Static import
        System.out.println("MethodWithReturn.toplama(2,3) = " + MethodWithReturn.toplama(2, 3));
        //new Scanner(System.in).nextLine();
        StringUtil.reverse("Ahmet");

        Car.staticDeneme(); //Statik metod




    }
}
