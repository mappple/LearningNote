package sword;

public class No_53_II_0_n_1中缺失的数字 {
    public int missingNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                return ++nums[i - 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 7, 8};
        System.out.println(new No_53_II_0_n_1中缺失的数字().missingNumber(nums));
    }
}
