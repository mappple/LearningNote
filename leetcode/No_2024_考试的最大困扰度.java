public class No_2024_考试的最大困扰度 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxConsecutiveChar(answerKey, k, 'T'), maxConsecutiveChar(answerKey, k, 'F'));
    }

    public int maxConsecutiveChar(String answerKey, int k, char ch) {
        int n = answerKey.length();
        int ans = 0;
        for (int left = 0, right = 0, sum = 0; right < n; right++) {
            //需要的操作数，保证该字符串全部连续
            sum += answerKey.charAt(right) != ch ? 1 : 0;
            while (sum > k) {
                //操作数大于k，滑动窗口向右移动，直到sum=k
                sum -= answerKey.charAt(left++) != ch ? 1 : 0;
            }
            //获得该字符串的在k操作数后的最大连续长度
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String t = "FTFTF";
        System.out.println(new No_2024_考试的最大困扰度().maxConsecutiveAnswers(t, 2));
    }
}
