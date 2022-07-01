package day03;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        //List<Integer> nums2 = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println("==========");

        //remove(index) remove(object)
        nums.remove(0); //100
        System.out.println("nums.remove(0) = " + nums.remove(0));//200
        System.out.println(nums);// 500 800

        nums.remove(500);//IndexOutOfBoundsException int 500 sayi olarak alir.

        Integer i = 500;
// nums.remove(500); this will go out of bounds because 500 is read as an int
        //number, and that is not a valid index
        nums.remove(i);
        //nums.remove((Integer) 500);
        System.out.println(nums);

        nums.remove(Integer.valueOf(200));
//nums.remove(Integer.valueOf("200")); // String 200 also works. Yine 200
        //integer objecte cevirir.
                System.out.println(nums);
        nums.remove((Integer)800);
        System.out.println(nums); //[] empty arrayList
    }
}
