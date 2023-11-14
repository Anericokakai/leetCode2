# removing duplicates in a sorted  array
> in order to remove duplicates from an array  we need to find the duplicates and skip them in our array 
> we push forward non duplicated elements then skip all the duplicates 
> we can choose to replace the duplicates with zero or just return the new array length


 ***Algorithm***
1. create a new  variable  that will hold the length of the array after the duplicates have been excluded i.e ``int newIndex=0``
2. loop the array ,
3. we then push the  current element to our  new index then increment the index by one i.e ``nums[newIndex++]=nums[i]`` 

4. inside the loop use a while loop to skip the duplicates in the array because the array is already sorted;
### how the  while loop works
we check if the current element is not out of bound i.e ``i!=nums.length-1`` and if the current index is equal to the next index i.e if ``nums[i]==nums[i+1]``
if they the condition is true we need to skip the element because it is repeated so we increment ``i++``,


5. return the newIndex;





## Complexity 
check if the value doesn't exist in our map then put it inside ou map
then return the size of the map


