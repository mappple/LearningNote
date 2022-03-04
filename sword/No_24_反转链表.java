import java.util.List;

public class No_24_反转链表 {
    public ListNode reverseList(ListNode head) {
        //新建头节点
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            //暂存后继节点
            ListNode next = curr.next;
            //修改引用指向，当前节点指向前一个节点，完成反转操作
            curr.next = prev;
            //暂存当前节点
            prev = curr;
            //访问下个节点
            curr = next;
        }
        return prev;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        PrintUtils.printThisList(l1);
    }
}
