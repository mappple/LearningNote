package No_6083_判断一个数的数字计数是否等于数位的值;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            int ch = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (map.containsKey(ch)) {
                int v = map.get(ch);
                map.put(ch, ++v);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < num.length(); i++) {
            int v = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (map.containsKey(i)) {
                if (map.get(i) != v) {
                    return false;
                }
            } else if (i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String t = "030";
        System.out.println(new Solution().digitCount(t));
    }
}