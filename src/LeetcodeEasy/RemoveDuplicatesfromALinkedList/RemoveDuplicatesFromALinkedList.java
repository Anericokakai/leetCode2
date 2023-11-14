package LeetcodeEasy.RemoveDuplicatesfromALinkedList;

import LeetcodeEasy.LinkedList.LinkedList;

public class RemoveDuplicatesFromALinkedList extends LinkedList {


    //    remove duplicates
    public ListNode removeDups(ListNode head, int val) {
        ListNode sHead = new ListNode(0), sTail = sHead, node = head;
        while (node != null) {
            ListNode next = node.next;
            node.next = null;
            if (node.val != val) {
                sTail.next = node;
                sTail = node;
            }
            node = next;
        }
        return sHead;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromALinkedList list = new RemoveDuplicatesFromALinkedList();
        list.insertElements(6);
        list.insertElements(2);
        list.insertElements(2);
        list.insertElements(3);
        list.insertElements(4);
        list.insertElements(6);
        list.insertElements(1);
        ListNode head=list.head;
        list.PrintNodes(head);
      ListNode newArray=  list.removeDups(head, 6);
      list.PrintNodes(newArray);
    }


}
