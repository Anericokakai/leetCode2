package LeetcodeEasy.LinkedList;


import LeetcodeEasy.RemoveDuplicatesfromALinkedList.RemoveDuplicatesFromALinkedList;

public abstract class LinkedList {

    //     ! create a linked list
    public ListNode head;

    // ! insert nodes at the and of the linked list
    public void insertElements(int val) {


        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;


    }

    public void PrintNodes(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static class ListNode {
      public    int val;
      public   ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
