package No_206_反转链表;

import datastructure.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; //前指针节点
        ListNode curr = head; //当前指针节点
        while (curr != null) {
            ListNode next = curr.next; //临时节点，暂存当前节点的下一个节点
            curr.next = prev; //当前节点指向它前面的节点
            prev = curr; //前指针后移
            curr = next; //当前指针后移
        }
        return prev;
    }
}