package leetcode.No_6084_最多单词数的发件人;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String, Integer> map = new HashMap<>();
        int len = messages.length;
        for (int i = 0; i < len; i++) {
            String mes = messages[i];
            int count = mes.split(" ").length;
            if (map.containsKey(senders[i])) {
                int v = map.get(senders[i]);
                map.put(senders[i], v + count);
            } else {
                map.put(senders[i], count);
            }
        }
        int max = -1;
        String name = senders[0];
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                name = entry.getKey();
                max = entry.getValue();
            } else if (entry.getValue() == max) {
                if (entry.getKey().compareTo(name) > 0) {
                    name = entry.getKey();
                }
            }
        }
        return name;
    }
}