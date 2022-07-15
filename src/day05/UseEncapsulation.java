package day05;

public class UseEncapsulation {

    public static void main(String[] args) {

        EncapsulationPractice1 practice1 = new EncapsulationPractice1();
        //practice1.brand="a";

        practice1.setBrand("Family");
        System.out.println("practice1.getBrand() = " + practice1.getBrand());
        System.out.println("practice1 = " + practice1);
        practice1.setColor("Blue");
        practice1.setHasEraser(true);
        practice1.setBrand("Orion");

        System.out.println("============");

        System.out.println("practice1 = " + practice1);
        System.out.println("practice1.getColor() = " + practice1.getColor());


    }

}
