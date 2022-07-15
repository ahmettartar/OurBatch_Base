package day05.hiding;

public class B extends A {

    @Override
    public void instanceMethodA(){
        //staticMet(); //Classin icindekini gorur
        super.staticMet(); // dogrudan super classa yonlendirdik
        // super.   => A. 'yi yani parenti ifade ediyor

    }

    //    @Override  we cannot override the static methods, but we can declare this method and
    //    the staticMethod from the parent class will become hidden
    public static void staticMet(){
        System.out.println("this class child class");
    }

}

