package leetcode.ds.intro.array;

import java.util.Arrays;

public class No_566_重塑矩阵 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < m * n; i++) {
            //c是每行有几个，对应n也是
            res[i / c][i % c] = mat[i / n][i % n];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new No_566_重塑矩阵().matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4)));
    }
}
