# how to reverse a linked list
> in order to reverse a linked list we have to change the pointers to the opposite direction
## logic
to reverse a linked list we need pointers , the current , next pointer and previous pointer

we have to loop the list from the head to the last element using the ``current `` pointer then for each node in the loop we need to separate it from the preceding 
nodes without losing the nodes , that's where the ``next`` pointer comes into the picture ,

before separating  the current node with the preceding nodes , we set the ``current.next`` to be our ``next ``
so as we don't lose track of the nodes

we then set the ``current.next`` to point to the previous;

we then set the ``previous = current ``  i.e  the previous to be our current
lastly we move our current forward by one so as it takes the position of the ``next`` 

we need to change the current's next   so as it can point to the previous  element , by default the pre