public class No_762_二进制表示中质数个计算置位 {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int x = left; x <=right; x++) {
            if (isPrime(Integer.bitCount(x))) {
                ++ans;
            }
        }
        return ans;
    }

    /**
     * 判断质数
     * @param x
     * @return
     */
    private boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}
