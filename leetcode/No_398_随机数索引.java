import java.util.*;

public class No_398_随机数索引 {
    class Solution {
        Map<Integer, List<Integer>> pos;
        Random random;

        public Solution(int[] nums) {
            pos = new HashMap<>();
            random = new Random();
            for (int i = 0; i < nums.length; i++) {
                pos.putIfAbsent(nums[i], new ArrayList<>());
                pos.get(nums[i]).add(i);
            }
        }

        public int pick(int target) {
            List<Integer> indices = pos.get(target);
            return indices.get(random.nextInt(indices.size()));
        }
    }
}
