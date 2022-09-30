package No_1608_特殊数组的特征值;

class Solution {
    public int specialArray(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (num >= i) {
                    count++;
                }
            }
            if (count == i) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] n = {3, 5};
        System.err.println(new Solution().specialArray(n));
    }
}