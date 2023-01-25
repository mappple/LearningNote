package sword;

public class No_03_数组中重复的数字 {
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            //当数组中元素的下标已经等于元素的值时，说明找到了重复元素
            if (nums[nums[i]] == nums[i]) return nums[i];
            //将元素放到下标对应的位置
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }

    public static void main(String[] args) {
        No_03_数组中重复的数字 no_03_数组中重复的数字 = new No_03_数组中重复的数字();
        int[] t = {2, 2, 3, 1};
        System.out.println(no_03_数组中重复的数字.findRepeatNumber(t));
    }
}
