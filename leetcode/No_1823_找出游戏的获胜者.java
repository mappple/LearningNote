import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class No_1823_找出游戏的获胜者 {
    public int findTheWinner(int n, int k) {
        List<Integer> buddys = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            buddys.add(i);
        }
        int start = 0;
        while(buddys.size() > 1) {
//            System.out.println("start="+start+" buddy="+buddys.get(start));
            start = (start + k - 1) % buddys.size();
            buddys.remove(start);
        }
        return buddys.get(0);
    }

    /**
     * 官解1 模拟
     * @param n
     * @param k
     * @return
     */
    public int findTheWinner2(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        System.out.println(new No_1823_找出游戏的获胜者().findTheWinner2(5, 2));
        System.out.println(new No_1823_找出游戏的获胜者().findTheWinner(6, 5));
    }
}
