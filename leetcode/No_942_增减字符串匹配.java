import java.util.*;

public class No_942_增减字符串匹配 {
    public int[] diStringMatch(String s) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i <= s.length(); i++) {
            queue.add(i);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                res.add(queue.pollFirst());
            } else {
                res.add(queue.pollLast());
            }
        }
        res.add(queue.poll());
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }

    /**
     * 官解 贪心
     * @param s
     * @return
     */
    public int[] diStringMatch2(String s) {
        int n = s.length(), lo = 0, hi = n;
        int[] perm = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            perm[i] = s.charAt(i) == 'I' ? lo++ : hi--;
        }
        perm[n] = lo; // 最后剩下一个数，此时 lo == hi
        return perm;
    }



    public static void main(String[] args) {
        String t = "IDID";
        String t2 = "III";
        System.out.println(Arrays.toString(new No_942_增减字符串匹配().diStringMatch(t2)));
    }
}
