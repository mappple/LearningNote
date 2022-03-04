import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */


public class No_6_从尾到头打印链表 {

    public int[] reversePrint(ListNode head) {
        List<Integer> res = new ArrayList<>();
        while (head != null) {
            res.add(head.val);
            head = head.next;
        }
        int[] array = new int[res.size()];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = res.get(res.size() - 1 - i);
        }
        return array;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        No_6_从尾到头打印链表 solution = new No_6_从尾到头打印链表();
        System.out.println(Arrays.toString(solution.reversePrint(l1)));
    }
}
