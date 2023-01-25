package leetcode.No_6078_重排字符形成目标字符串;

class Solution {
    public int rearrangeCharacters(String s, String target) {
        /**
         * 思路：
         * 1 把 两个字符串分别存进两个数组， 这个数组 存储对应的 字符个数
         * 2 遍历target 的 数组，  取出数组两个对应的位置的 字符个数
         * 3 相除， 取最小的 倍数， 即为 答案
         */
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (char c : s.toCharArray()) {
            arr1[c - 'a']++;
        }
        for (char c : target.toCharArray()) {
            arr2[c - 'a']++;
        }
        //3 遍历 target数组 ，取最小的 倍数
        int min = Integer.MAX_VALUE;
        for (char c : target.toCharArray()) {
            int temp = arr1[c - 'a'] / arr2[c - 'a'];
            min = Math.min(min, temp);
        }
        return min;
    }

    public static void main(String[] args) {
        String s = "abbaccaddaeea", target = "aba";
        System.out.println(new Solution().rearrangeCharacters(s, target));
    }
}