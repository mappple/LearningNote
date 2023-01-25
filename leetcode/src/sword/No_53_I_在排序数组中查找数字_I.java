package sword;

public class No_53_I_在排序数组中查找数字_I {
    public int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 5, 6, 7, 8, 9, 9, 9};
        int target = 9;
        System.out.println(new No_53_I_在排序数组中查找数字_I().search(nums, target));
    }
}
