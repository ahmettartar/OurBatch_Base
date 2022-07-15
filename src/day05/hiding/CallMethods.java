package day05.hiding;

public class CallMethods {
    public static void main(String[] args) {

        A obj = new A();
        obj.instanceMethodA();
        A.staticMet();

        System.out.println();

        B obj2 = new B();
        obj2.instanceMethodA();
        B.staticMet();


    }
}

