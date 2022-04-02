import java.util.ArrayList;
import java.util.List;

public class No_728_自除数 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int tar = i;
            while (tar >= 0) {
                if (tar == 0) {
                    res.add(i);
                    break;
                }
                int cur = tar % 10;
                if (cur == 0 || i % cur != 0) {
                    break;
                } else {
                    tar /= 10;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(new No_728_自除数().selfDividingNumbers(left, right));
    }
}
