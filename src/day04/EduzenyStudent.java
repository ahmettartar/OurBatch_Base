package day04;

import java.util.Arrays;

public class EduzenyStudent {
    public String name;
    public int groupNumber;
    public static int batchNumber;
    public static String[] instructors;
    public static String schoolName;
    // you can assign and declare at the same time, but it is not recommended, we
    //will use static block to assign


    static {
        batchNumber = 01;
        instructors = new String[]{"Hamza", "Mehmet", "Austin", "Suleyman", "Niyazi"};
        schoolName = "Eduzeny";
        printInfo();
    }

    public static void printInfo(){
        System.out.println("School Name: " + schoolName);
        System.out.println("Batch Number " + batchNumber);
        System.out.println("Instructors " + Arrays.toString(instructors));
    }


    public EduzenyStudent(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "EduzenyStudent{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
