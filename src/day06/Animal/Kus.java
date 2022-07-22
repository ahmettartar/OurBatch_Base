package day06.Animal;

public class Kus extends Animal implements Flyable {

    public Kus(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Kus mamasini yiyor.");
    }

    @Override
    public void fly() {
        System.out.println(" Kuslar ucabiliyor");

    }
}
