package No_944_删列造序;

class Solution {
    public int minDeletionSize(String[] strs) {
        int res = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            char cur = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (cur > strs[j].charAt(i)) {
                    res++;
                    break;
                } else {
                    cur = strs[j].charAt(i);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs = {"cba","daf","ghi"};
        String[] strs2 = {"rrjk","furt","guzm"};
        System.out.println(new Solution().minDeletionSize(strs2));
    }
}