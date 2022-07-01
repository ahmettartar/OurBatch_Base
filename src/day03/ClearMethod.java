package day03;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Basta " + nums.isEmpty());
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        System.out.println("Now I clear:");
        nums.clear();// listeyi bosaltir
        System.out.println(nums);// []
        System.out.println(nums.size());//0
        System.out.println(nums.isEmpty());//true
    }
}
