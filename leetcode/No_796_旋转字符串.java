public class No_796_旋转字符串 {
    public boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            String newS = s.substring(1) + s.charAt(0);
            if (goal.equals(newS)) {
                return true;
            } else {
                s = newS;
            }
        }
        return false;
    }

    public boolean rotateString2(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
