package leetcode.No_6096_咒语和药水的成功对数;

import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int len = spells.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < potions.length; j++) {
                if (spells[i] >= (success / (long) potions[j])) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().successfulPairs(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16)));
    }
}