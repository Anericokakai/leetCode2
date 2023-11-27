package Codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayDiffCater6 {

    public static void main(String[] args) {
      int[] a =  new int[] {1,2,2};
      int [] b= new int[] {1};
        Map<Integer,Integer> temp=new HashMap<>();
        for(int i=0;i<a.length;i++){
            temp.put(i,a[i]);
        }
        System.out.println(temp);

        for(int j=0;j<b.length;j++){

            if(!temp.containsValue(b[j])&&!temp.isEmpty()){
                temp.put(j,b[j]);
            }else temp.remove(j);

        }
        System.out.println(temp.values());
        temp.forEach((key,value)->{
            System.out.println(key +":"+value);
            a[key]=value;
        });

        System.out.println(Arrays.toString(a));
    }
}
