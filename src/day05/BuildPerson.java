package day05;

public class BuildPerson {

    public static void main(String[] args) {

        Person person1 = new Person("Ahmet", 30, "Erkek");
        System.out.println("person1 = " + person1);

//        person1.gender = "Girl";
//        person1.name = "Elif";
//        person1.age = 15;

        person1.walk();
        //person1.study Parent has no this feature

        //Student
        Student student1 = new Student("Ayse", 15, "Kiz", 123);
        student1.regNumber =100; //reassigning
        student1.study();
        student1.walk();
        System.out.println("student1 = " + student1);

        Teacher teacher1 = new Teacher("Ali", 45, "Erkek");
        teacher1.dersVeriyor();


    }

}
