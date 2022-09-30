package No_121_买卖股票的最佳时机;

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int pre = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - pre;
            if (profit > 0) {
                max = Math.max(profit, max);
            } else {
                pre = prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] t = new int[]{7, 1, 5, 3, 6, 4};
        System.err.println(new Solution().maxProfit(t));
    }
}