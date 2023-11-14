# move zeroes to the end
we need  a pointer that keeps track of non zero elements
``lastElement=0``

we also need to loop the array , 
checking for non-zero elements if we find a non-zero element   we push it the the current pointer then icrement the pointer by one 

we need a while loop which will make the rest of the elements a zero after pushing the non zero elements foward;
## algorithm
1. loop the array
2. check for non-zero elements if it exists push the element to our  'lastElement' index and increment the 'lastElement' by one ``nums[lastElement++]=nums[i]``
3. use a while loop which loops from ``lastElement`` index to the end of array and make them zeros  as we have already pushed non-zero elements forward;

## complexity
the time complexity is ``O(n)+ O(n) `` which is the same as ``O(n)``