package LeetcodeEasy.ReverseALinkedList;

import LeetcodeEasy.LinkedList.LinkedList;
// ! we have used solid principle and some inheritance to avoid code reception

public class LinkedListReverse extends LinkedList {


// fuction to reverse a linked list

    public static void main(String[] args) {
        LinkedListReverse linkedListReverse = new LinkedListReverse();

        linkedListReverse.insertElements(1);
        linkedListReverse.insertElements(3);
        linkedListReverse.insertElements(5);
        linkedListReverse.insertElements(7);
        linkedListReverse.PrintNodes(linkedListReverse.head);
        ListNode reversedList = linkedListReverse.reverseList(linkedListReverse.head);
        linkedListReverse.PrintNodes(reversedList);


    }

    public ListNode reverseList(ListNode head) {


//        if empty
        if (head == null) {
            return null;
        }

        ListNode next;
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {


//             ! unlink the head from the rest of the list
            next = current.next;
//            !pont the current to previous

            current.next = previous;
//   !         make the previous now be our current
            previous = current;
//  !          make our next be the current
            current = next;
        }
        return previous;


    }

}
