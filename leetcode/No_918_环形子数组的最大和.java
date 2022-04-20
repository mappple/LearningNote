public class No_918_环形子数组的最大和 {
    public int maxSubarraySumCircular(int[] A) {
        int total = 0, maxSum = A[0], curMax = 0, minSum = A[0], curMin = 0;
        for (int a : A) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + a, a);
            minSum = Math.min(minSum, curMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }

    public static void main(String[] args) {
        int[] t = {-2, -5, -1};
        int[] t2 = {-3, -2, -3};
        System.out.println(new No_918_环形子数组的最大和().maxSubarraySumCircular(t));
    }
}
