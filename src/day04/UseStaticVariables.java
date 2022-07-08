package day04;

public class UseStaticVariables {
    public static void main(String[] args) {

        StaticVariables s1 = new StaticVariables("Ali", 15);
        System.out.println(s1);
        s1.eat();

        //Static
        System.out.println("StaticVariables.schoolName = " + StaticVariables.schoolName);

        StaticVariables.para=50; //Bir copy var, butun opjeler tarafinndan paylasilir
        System.out.println("s1: StaticVariables.para = " + StaticVariables.para);

        StaticVariables s2 = new StaticVariables("Ahmet", 40);
        System.out.println(s2);
        System.out.println("s2: StaticVariables.para = " + StaticVariables.para);

    }



}
