package No_6125_相等行列对;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count += equalPairs(i, j, grid);
            }
        }
        return count;
    }


    private int equalPairs(int i, int j, int[][] grid) {
        for (int k = 0; k < grid.length; k++) {
            if (grid[i][k] != grid[k][j]) {
                return 0;
            }
        }
        return 1;
    }
}