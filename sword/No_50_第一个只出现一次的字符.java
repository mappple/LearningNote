import java.util.HashMap;
import java.util.Map;

public class No_50_第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for (char c : chars) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String t = "leetcode";
        System.out.println(new No_50_第一个只出现一次的字符().firstUniqChar(t));
    }
}
