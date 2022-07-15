package day05.hiding;

public class A {

    public void instanceMethodA(){
        staticMet();
    }

    public static void staticMet(){
        System.out.println("this class parent class");
    }

}

