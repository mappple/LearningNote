package sword;

public class No_002_二进制加法 {

    /**
     * 考虑一个最朴素的方法：先将 aaa 和 bbb 转化成十进制数，求和后再转化为二进制数。
     * 利用 Python 和 Java 自带的高精度运算，我们可以很简单地写出这个程序：
     */
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
        );
    }

    /**
     * 模拟
     * 我们可以借鉴「列竖式」的方法，末尾对齐，逐位相加。在十进制的计算中「逢十进一」，二进制中我们需要「逢二进一」。
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary2(String a, String b) {
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }

    public static void main(String[] args) {
        String a = "11", b = "10";
        System.out.println(new No_002_二进制加法().addBinary2(a, b));
    }
}