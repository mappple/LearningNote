package No_6149_边积分最高的节点;

class Solution {
    public int edgeScore(int[] edges) {
        long[] ans = new long[edges.length];
        for (int i = 0; i < edges.length; i++) {
            ans[edges[i]] += i;
        }
        long max = 0;
        int loc = 0;
        for (int i = 0; i < edges.length; i++) {
            if (ans[i] > max) {
                max = ans[i];
                loc = i;
            }
        }
        return loc;
    }
}