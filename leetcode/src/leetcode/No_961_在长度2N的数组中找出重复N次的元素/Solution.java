package leetcode.No_961_在长度2N的数组中找出重复N次的元素;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                int v = map.get(num);
                map.put(num, ++v);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == nums.length /2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}