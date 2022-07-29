package day07.animal;

public class Kus extends Animal implements Ucmak{
    @Override
    public void ucabilme() {
        System.out.println("Kus ucuyor.");
    }

    @Override
    public void eat() {
        System.out.println("Kus yemini yiyor");;
    }

    @Override
    public void sleep() {
        System.out.println("Kus kafeste uyuyor");;
    }

    public void cikcik(){
        System.out.println("Kus cikcik ediyor");
    }

}
