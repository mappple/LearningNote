package leetcode;

public class No_560_和为K的子数组 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; ++start) {
            int sum = 0;
            for (int end = start; end >= 0; --end) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int k = 3;
        System.out.println(new No_560_和为K的子数组().subarraySum(nums, k));
    }
}
