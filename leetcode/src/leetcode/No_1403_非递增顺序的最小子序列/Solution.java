package leetcode.No_1403_非递增顺序的最小子序列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int total = Arrays.stream(nums).sum();
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        int curr = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            //从末尾开始累加
            curr += nums[i];
            //每次都加入结果数组
            ans.add(nums[i]);
            //如果剩余的总值<当前的总值就结束
            if (total - curr < curr) {
                break;
            }
        }
        return ans;
    }
}