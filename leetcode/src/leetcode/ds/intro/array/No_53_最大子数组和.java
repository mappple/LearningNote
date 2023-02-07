package leetcode.ds.intro.array;

class No_53_最大子数组和 {
    /**
     * dp
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        int[] num = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new No_53_最大子数组和().maxSubArray(num));
    }
}