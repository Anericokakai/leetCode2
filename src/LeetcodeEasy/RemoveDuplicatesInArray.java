package LeetcodeEasy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class RemoveDuplicatesInArray {

    public  static void print(int[] nums){
        for (int j:nums){
            System.out.println(j);
        }
    }

//    Method 1
    public  static  int  removeDups(int[] nums){

        int max=nums.length;
        int j;

//        check time complexity ussing miliseconds

        for (int i=0;i<max;i++){
            for (j=i+1;j<max;j++){
                if(nums[i]==nums[j]){
//                    remove the jth index

                    for(int k=j;k<max-1;k++){
                        nums[k]=nums[k+1];
                    }

                    max--;
                    j--;
                }
            }
        }


        return  max;

    }


//    method 2

    public  static  int  removeDuplicateSecond(int[] nums){

        Map<Integer,Integer> map=new HashMap<>();

        int max= nums.length;
        for(int k=0;k<max;k++){

            if(map.containsValue(nums[k])){
               for(int j=k;j<max-1;j++){
                   nums[j]=nums[j+1];

               }
               k--;
               max--;

            }else{

                map.put(k,nums[k]);
            }

        }



        return  map.size()  ;


    }
    public static void main(String[] args) {

        int [] nums={0,0,1,1,1,2,2,3,3,4};
//        double time =System.currentTimeMillis();
// int newArraySize=removeDups(nums);
//        System.out.println("the time take to un this coe is :"+(System.currentTimeMillis()));
// System.out.println ("array size is "+newArraySize);

      removeDuplicateSecond(nums);


    }
}
