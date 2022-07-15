package day05;

public class Teacher extends Person{

    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void dersVeriyor(){
        System.out.println(name + " is delivering the lecture");
    }


}
