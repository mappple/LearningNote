package leetcode.No_6124_第一个出现两次的字母;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public char repeatedCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                return s.charAt(i);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        return s.charAt(s.length() - 1);
    }
}