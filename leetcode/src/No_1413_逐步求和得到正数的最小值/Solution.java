package No_1413_逐步求和得到正数的最小值;

class Solution {
    public int minStartValue(int[] nums) {
        int accSum = 0, accSumMin = 0;
        for (int num : nums) {
            accSum += num;
            accSumMin = Math.min(accSum, accSumMin);
        }
        return -accSumMin + 1;
    }
}