package leetcode;

public class No_278_第一个错误的版本 {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    /**
     * 二分查找
     */
    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left = 1, right = n;
            while (left < right) { // 循环直至区间左右端点相同
                int mid = left + (right - left) / 2; // 防止计算时溢出
                if (isBadVersion(mid)) {
                    right = mid; // 答案在区间 [left, mid] 中
                } else {
                    left = mid + 1; // 答案在区间 [mid+1, right] 中
                }
            }
            // 此时有 left == right，区间缩为一个点，即为答案
            return left;
        }
    }
}
