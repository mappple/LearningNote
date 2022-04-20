public class No_1672_最富有客户的资产总量 {
    public int maximumWealth(int[][] accounts) {
        int n = accounts[0].length;
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += account[j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
