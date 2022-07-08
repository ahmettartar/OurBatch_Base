package day04;

public class Student {
    String name;
    int age;

    public int yasiniz(int age){
        return age+=age; //age = age +age
    }

    public void study(){
        System.out.println(name + " cok calisiyor");
    }




    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
