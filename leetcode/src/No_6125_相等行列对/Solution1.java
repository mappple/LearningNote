package No_6125_相等行列对;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int[] ints : grid) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(ints[j]);
            }
            map.put(row, map.getOrDefault(row, 0) + 1);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> col = new ArrayList<>();
            for (int[] ints : grid) {
                col.add(ints[i]);
            }
            if (map.containsKey(col)) {
                res += map.get(col);
            }
        }
        return res;
    }
}
