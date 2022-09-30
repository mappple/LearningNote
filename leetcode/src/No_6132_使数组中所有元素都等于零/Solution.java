package No_6132_使数组中所有元素都等于零;

import java.util.Arrays;

class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                count++;
                minus(nums, nums[i]);
            }
        }
        return count;
    }

    private void minus(int[] nums, int c) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] -= c;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 0, 3, 5};
        int[] nums1 = new int[]{0};
        System.out.println(new Solution().minimumOperations(nums1));
    }
}