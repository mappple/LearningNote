package leetcode.No_899_有序队列;

import java.util.Arrays;

/**
 * 分情况讨论
 * 当 k = 1 时，每次只能取 s 的首个字符并将其移动到末尾，因此对于给定的字符串，可能的移动方法是唯一的，移动后的结果也是唯一的。
 * 对于长度为 n 的字符串 s ，经过 0 次到 n - 1 次移动之后分别得到 n 个字符串，这 n 个字符串中的字典序最小的字符串即为答案。
 * <p>
 * 当 k > 1 时，一定可以经过移动将 s 变成升序字符串，因此将字符串 s 升序排序之后得到的字符串即为答案。
 * <p>
 * 作者：LeetCode-Solution
 * 链接：<a href="https://leetcode.cn/problems/orderly-queue/solution/you-xu-dui-lie-by-leetcode-solution-p6gv/">...</a>
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
class Solution {
    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String smallest = s;
            StringBuilder sb = new StringBuilder(s);
            int n = s.length();
            for (int i = 0; i < n; i++) {
                char c = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(c);
                if (sb.toString().compareTo(smallest) < 0) {
                    smallest = sb.toString();
                }
            }
            return smallest;
        } else {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
    }
}