public class No_746_使用最小花费爬楼梯 {
    public int minCostClimbingStairs(int[] cost) {
       int n = cost.length;
       int prev = 0, curr = 0;
        for (int i = 2; i <= n; i++) {
            int next = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        int[] t = {10, 15, 20};
        System.out.println(new No_746_使用最小花费爬楼梯().minCostClimbingStairs(t));
    }
}
