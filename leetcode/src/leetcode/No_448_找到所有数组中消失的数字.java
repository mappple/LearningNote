package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No_448_找到所有数组中消失的数字 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i < len + 1; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }

    /**
     * 官解
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            int x = (num - 1) % len;
            nums[x] += len;
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] <= len) {
                res.add(i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //1 2 2 3 4 7 8
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(new No_448_找到所有数组中消失的数字().findDisappearedNumbers2(nums));
    }
}
