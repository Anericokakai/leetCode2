package LeetcodeEasy.RemoveDuplicatesFromArray;



public class RemoveDuplicatesInArray {
//    ! PRINT THE ELEMENTS ON THE CONSOLE

    public static void print(int[] nums) {
        for (int j : nums) {
            System.out.print(j+" ,");
        }
    }
//    ! METHOD TO REMOVE DUPLICATES

    public static int removeDuplicates(int[] nums) {

        int newIndex = 0;
//        ! loop the array
        for (int i = 0; i < nums.length; i++) {
            nums[newIndex++] = nums[i];
//            skip the duplicates
            while (i != nums.length-1 && nums[i] == nums[i + 1]) {

                i++;
            }

        }
//        make the rest zeros
        while (newIndex<nums.length){
            nums[newIndex]=0;
            newIndex++;
        }

        print(nums);
        return   newIndex;


    }

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4,7};
        removeDuplicates(nums);


    }
}
