package day03;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.add(900);
        System.out.println(nums);

        nums.add(2, 34);// other elements are moved over
        System.out.println(nums);

        nums.set(0, -50);
        System.out.println(nums);

        nums.set(2, 50000);
        System.out.println(nums);
//nums.set(10, 700); goes out of bounds
    }
}
