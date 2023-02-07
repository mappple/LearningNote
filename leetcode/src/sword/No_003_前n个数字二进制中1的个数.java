package sword;

import java.util.Arrays;

public class No_003_前n个数字二进制中1的个数 {

    /**
     * Brian Kernighan 算法
     * 最直观的做法是对从0到n的每个整数直接计算「一比特数」。
     * 每个int型的数都可以用32位二进制数表示，只要遍历其二进制表示的每一位即可得到1的数目。
     * 利用Brian Kernighan算法，可以在一定程度上进一步提升计算速度。
     * 算法的原理是：对于任意整数x，令 x=x&(x−1),该运算将x的二进制表示的最后一个1变成0。
     * 因此，对x重复该操作，直到x变成0，则操作次数即为x的「一比特数」。
     * 对于给定的n，计算从0到n的每个整数的「一比特数」的时间都不会超过O(logn)，因此总时间复杂度为O(nlogn)。
     *
     * @param n
     * @return
     */
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            bits[i] = countOnes(i);
        }
        return bits;
    }

    private int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x &= x - 1;
            ones++;
        }
        return ones;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new No_003_前n个数字二进制中1的个数().countBits(5)));
    }
}
