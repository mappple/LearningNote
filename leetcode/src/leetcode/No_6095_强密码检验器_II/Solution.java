package leetcode.No_6095_强密码检验器_II;

class Solution {
    public boolean strongPasswordCheckerII(String password) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String abc2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String n = "0123456789";
        String x = "!@#$%^&*()-+";
        int len = password.length();
        if (password.length() < 8) {
            return false;
        }
        int a = 0;
        for (int i = 0; i < len; i++) {
            if (abc.contains(String.valueOf(password.charAt(i)))) {
                a++;
            }
        }
        if (a == 0) {
            return false;
        }
        int b = 0;
        for (int i = 0; i < len; i++) {
            if (abc2.contains(String.valueOf(password.charAt(i)))) {
                b++;
            }
        }
        if (b == 0) {
            return false;
        }
        int c = 0;
        for (int i = 0; i < len; i++) {
            if (n.contains(String.valueOf(password.charAt(i)))) {
                c++;
            }
        }
        if (c == 0) {
            return false;
        }
        int d = 0;
        for (int i = 0; i < len; i++) {
            if (x.contains(String.valueOf(password.charAt(i)))) {
                d++;
            }
        }
        if (d == 0) {
            return false;
        }
        for (int i = 0; i < len - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().strongPasswordCheckerII("a!beXdg0ln"));
    }
}