import java.util.HashMap;
import java.util.Map;

public class No_35_复杂链表的复制 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    Map<Node, Node> cachedNode = new HashMap<>();

    /**
     * 解法一 哈希表+回溯（递归）
     *
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        if (!cachedNode.containsKey(head)) {
            Node newHead = new Node(head.val);
            cachedNode.put(head, newHead);
            newHead.next = copyRandomList(head.next);
            newHead.random = copyRandomList(head.random);
        }
        return cachedNode.get(head);
    }

    /**
     * 解法二 迭代+节点拆分
     *
     * @param head
     * @return
     */
    public Node copyRandomList2(Node head) {
        if (head == null) {
            return null;
        }
        for (Node node = head; node != null; node = node.next.next) {
            Node newNode = new Node(node.val);
            newNode.next = node.next;
            node.next = newNode;
        }
        for (Node node = head; node != null; node = node.next.next) {
            Node newNode = node.next;
            newNode.random = (node.random != null) ? node.random.next : null;
        }
        Node headNew = head.next;
        for (Node node = head; node != null; node = node.next) {
            Node newNode = node.next;
            node.next = node.next.next;
            newNode.next = (newNode.next != null) ? newNode.next.next : null;
        }
        return headNew;
    }
}
