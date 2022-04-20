public class No_1137_第N个泰波那契数 {
    //超时
    public int tribonacci2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int p, q = 0, r = 1, s = 1;
        for (int i = 3; i <= n; ++i) {
            p = q;
            q = r;
            r = s;
            s = p + q + r;
        }
        return s;
    }
}
