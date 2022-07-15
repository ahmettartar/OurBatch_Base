package day05;

public class Student extends Person {

    int regNumber;

    public Student(String name, int age, String gender, int regNumber) {
        super(name, age, gender);
        this.regNumber = regNumber;
    }



    public void study(){
        System.out.println(name + " is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", regNumber=" + regNumber +
                '}';
    }
}
