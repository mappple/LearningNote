package sword;

public class No_58_II_左旋转字符串 {
    // 共有三种方法呢

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
