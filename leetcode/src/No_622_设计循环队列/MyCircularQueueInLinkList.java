package No_622_设计循环队列;

import datastructure.ListNode;

/**
 * 链表实现
 */
class MyCircularQueueInLinkList {
    private ListNode head;
    private ListNode tail;
    private int capacity;
    private int size;

    public MyCircularQueueInLinkList(int k) {
        capacity = k;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        ListNode node = new ListNode(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = head.next;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return head.val;
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return tail.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        MyCircularQueueInLinkList circularQueue = new MyCircularQueueInLinkList(3); // 设置长度为 3
        System.out.println(circularQueue.enQueue(1));// 返回 true
        System.out.println(circularQueue.enQueue(2));// 返回 true
        System.out.println(circularQueue.enQueue(3));// 返回 true
        System.out.println(circularQueue.enQueue(4));// 返回 false，队列已满
        System.out.println(circularQueue.Rear());// 返回 3
        System.out.println(circularQueue.isFull());// 返回 true
        System.out.println(circularQueue.deQueue());// 返回 true
        System.out.println(circularQueue.enQueue(4));// 返回 true
        System.out.println(circularQueue.Rear());// 返回 4
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */