import java.util.Stack;

class CQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.add(value);
    }

    public int deleteHead() {
        //栈2为空，才将栈1内的元素全部进栈
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.add(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            return -1;
        }
        //栈2不空，直接取栈顶
        return s2.pop();
    }
}

public class No_9_用两个栈实现队列 {

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}
