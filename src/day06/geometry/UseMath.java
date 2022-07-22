package day06.geometry;

public class UseMath {

    public static void main(String[] args) {

        Circle c1 = new Circle("Daire", 5);
        System.out.println("Circle: c1.area() = " + c1.area());

        Square s1 = new Square("Kare", 10);
        System.out.println("Square: s1.area() = " + s1.area());

        Rectangular r1 = new Rectangular("Dikdortgen", 10, 5);
        System.out.println("Rectangular: r1.area() = " + r1.area());


    }
}
