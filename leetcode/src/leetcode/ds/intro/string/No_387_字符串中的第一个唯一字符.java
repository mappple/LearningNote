package leetcode.ds.intro.string;

import java.util.HashMap;
import java.util.Map;

public class No_387_字符串中的第一个唯一字符 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int v = map.getOrDefault(c, 0);
            v++;
            map.put(c, v);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 数组解法
     *
     * @param s
     * @return
     */
    public int firstUniqChar2(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;
        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(new No_387_字符串中的第一个唯一字符().firstUniqChar(s));
    }
}
