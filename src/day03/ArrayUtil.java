package day03;

public class ArrayUtil {
    /*
Min Number
create a method that will accept an int array and return the smallest number
from the array
*/
    public static int minNumber(int [] nums){
        int min = nums[0];
        for(int num : nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public static int maxNumber(int [] nums){
        int max = nums[0];
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public static boolean containsArray(int[] nums, int element) {
        for (int each : nums) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }


}
