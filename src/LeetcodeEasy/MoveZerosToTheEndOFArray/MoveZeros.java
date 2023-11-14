package LeetcodeEasy.MoveZerosToTheEndOFArray;


public class MoveZeros {


    public static int moveZerosFunction(int[] nums) {

        int lastElement = 0;

        for (int i = 0; i < nums.length; i++) {


            if (nums[i] != 0) nums[lastElement++] = nums[i];

        }
        while (lastElement < nums.length) {
            nums[lastElement] = 0;
            lastElement++;
        }

        printelements(nums);
        return lastElement;

    }

    public static void printelements(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ,");
        }
    }


    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        moveZerosFunction(nums);


    }


}
