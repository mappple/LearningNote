package leetcode.No_6085_道路的最大总重要性;

import java.util.Arrays;

class Solution {
    /**
     * 原理排序不等式
     * 大配大，小配小，价值最高
     *
     * @param n
     * @param roads
     * @return
     */
    public long maximumImportance(int n, int[][] roads) {
        int[] deg = new int[n];
        for (int[] road : roads) {
            deg[road[0]]++;
            deg[road[1]]++;
        }
        long ans = 0L;
        Arrays.sort(deg);
        for (int i = n - 1; i >= 0; i--) {
            ans += (long) (i + 1) * deg[i];
        }
        return ans;
    }
}