package day07.animal;

public class At extends Animal{

    @Override
    public void eat() {
        System.out.println("At, kendi yemini yiyor.");
    }

    @Override
    public void sleep() {
        System.out.println("Atlar guzel uyur");
    }

    public void running(){
        System.out.println("Atlar hizli kosar");
    }
}
