package leetcode;

import java.util.HashMap;
import java.util.Map;

public class No_242_有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        if (t.length() > s.length()) {
            String temp = s;
            s = t;
            t = temp;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i));
                map.put(s.charAt(i), ++count);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            Integer count = map.get(t.charAt(i));
            if (count != null && count > 1) {
                map.put(t.charAt(i), --count);
            } else {
                map.remove(t.charAt(i));
            }
        }
        return map.isEmpty();
    }

    /**
     * 官解
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freqs = new int[26];
        for (char c : s.toCharArray()) freqs[c - 'a']++;
        for (char c : t.toCharArray()) if (--freqs[c - 'a'] < 0) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new No_242_有效的字母异位词().isAnagram("anagram", "nagaram"));
    }
}
