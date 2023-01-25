package leetcode.No_1408_数组中的字符串匹配;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}