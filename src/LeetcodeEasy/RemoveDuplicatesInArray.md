# removing duplicates in an array
> in order to remove duplicates from an array we can approach it in two ways assuming 
> the first way is to assume about the time complexity

 ***Algorithm***
1. we need the first loop which traverses the entire array
2. a nested for loop is also used to compare each element with the rest of the elements
3. if a duplicate is found we need to move all the  elements by one step so that we can get rid of the duplicate
4. note to move the elements forward by one step we also need another loop
5. because we have removed the duplicate we need to resize our array `we decrement our array size by 1`

```java
int [] nums= new int[3];

for(int i=0;i<nums.length;i++){
//nested for loop
        
        for(int j=i;j<num.length;j++){
//            we compare the first index `i` with the  'j' to check if they match
        if(nums[i]==nums[j]){
//            we need another for loop now to  move all the elements one step ahead;
        for (int k=j;k<nums.length;k++){
//            we move each element a step ahead
        
        nums[k]=nums[k+1];
                       }
        we have to reduce the size of the array
        nums.length--;
//     explained below   
        j--;
        }
        }
        }
```

>the reson as to why we also decrement the i is because if this
> assume we have 3 duplicates in our array``111``, we check if i==j which is true then we move elements forward a single step then reduce the array size to 2 ,then we go back to the nested loop
> we increment j by one note that j switches from index zero to one now we have a array like this ;
> 1 1 now our j point to the second  element in the array but still we have a duplicate at index 0 when we decrement j ``j--``  we make sure that j starts at index 0 to check if there are duplicates 


##  draw backs
we are nesting three loops that way much worse than ``o(n)2`` time complexity thus means our code we execute with the longest time ever as the input n increases

# method 2
>we can use hash map to store our new array with no duplicates then return the size of the hash ap notice we use less code and only a single for loop

## Algorithm
check if the value doesn't exist in our map then put it inside ou map
then return the size of the map


