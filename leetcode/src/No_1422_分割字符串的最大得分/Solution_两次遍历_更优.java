package No_1422_分割字符串的最大得分;

class Solution_两次遍历_更优 {
    public int maxScore(String s) {
        int score = 0;
        int n = s.length();
        if (s.charAt(0) == '0') {
            score++;
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '1') {
                score++;
            }
        }
        int ans = score;
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                score++;
            } else {
                score--;
            }
            ans = Math.max(ans, score);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "011101";
        System.out.println(new Solution_两次遍历_更优().maxScore(s));
    }
}