public class Main {

    public static void moveZeroes(int[] nums) {
        int max=nums.length;

        int temp=nums.length;



        for(int i= 0;i<max;i++){

            if(nums[i]==0){
                temp--;

                for(int j=i;j<max-1;j++){

                    nums[j]=nums[j+1];
                }
                i--;

                max--;
            }

        }

        if(nums.length!=temp){
            for(int k=temp;k<nums.length;k++){
                nums[k]=0;
            }

        }

    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            nums[i++] = nums[j];

            while (j != nums.length - 1 && nums[j] == nums[j + 1]) {
                j++;
            }
        }

        return i;
    }
    public static void main(String[] args) {
       int[] nums={0,1,0,3,12};

       int [] nums2={1,1,3,4,4};

       removeDuplicates(nums2);
        moveZeroes(nums);
    }
}