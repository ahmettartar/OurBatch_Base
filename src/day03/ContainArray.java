package day03;

public class ContainArray {
    /*TASK
    Contains
    create a method that will accept an int array and an int number. Check and
    return if the given number is in the array.
    */
    public static boolean methodCompare(int[] nums, int element) {
        for (int e : nums) {
            if (e == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,4,6,9,13,0,23};
        System.out.println("contains(a, 0) = " + methodCompare(a, 20));

    }
}

