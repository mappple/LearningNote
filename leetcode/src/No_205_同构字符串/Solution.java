package No_205_同构字符串;


class Solution {
    //indexOf方法返回第一个指定元素出现的下标，若两个字符串中出现了下标不一致的情况则说明：一定有某个字符串的字符出现了两次以上
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}