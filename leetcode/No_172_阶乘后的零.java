public class No_172_阶乘后的零 {

    /**
     * n!尾零的数量即为n!中因子10的个数，而10=2×5，因此转换成求n!中质因子2的个数和质因子5的个数的较小值。
     * 由于质因子5的个数不会大于质因子2的个数（具体证明见方法二），我们可以仅考虑质因子5的个数。
     * 而n!中质因子5的个数等于[1,n]的每个数的质因子5的个数之和，我们可以通过遍历[1,n]的所有5的倍数求出。
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int ans = 0;
        for (int i = 5; i <= n; i += 5) {
            for (int x = i; x % 5 == 0; x /= 5) {
                ++ans;
            }
        }
        return ans;
    }

    /**
     *
     * @param n
     * @return
     */
    public int trailingZeroes2(int n) {
        int ans = 0;
        while (n != 0) {
            n /= 5;
            ans += n;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new No_172_阶乘后的零().trailingZeroes(25));
    }
}
