package Codewars;

public class CaterEight {
    public static void main(String[] args) {

        String [] arr=  new String[]{"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"};
        int points=0;
        for(int i=0;i<arr.length;i++){
            int  ourTeam= Integer.parseInt(arr[i].split(":")[0]);
            int oponent=Integer.parseInt(arr[i].split(":")[1]);


            if(ourTeam>oponent) points+=3;
            if(ourTeam==oponent)points+=1;


        }
        System.out.println(points);
    }

}
