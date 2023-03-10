package leetcode;

import java.util.HashSet;
import java.util.Set;

public class No_2357_使数组中所有元素都等于零 {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        return set.size();
    }

}
