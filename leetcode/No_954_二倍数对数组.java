import java.util.*;

public class No_954_二倍数对数组 {
    /**
     * 设arr的长度为n，题目本质上是问arr能否分成n/2对元素，每对元素中一个数是另一个数的两倍。
     * 设cnt[x]表示arr中x的个数。
     * 对于arr中的0，它只能与0匹配。如果cnt[0]是奇数，那么必然无法满足题目要求。
     * 去掉arr中的0。设x为arr中绝对值最小的元素，由于没有绝对值比x更小的数，因此x只能与2x匹配。
     * 如果此时cnt[2x]<cnt[x]，那么会有部分x无法找到它的另一半，即无法满足题目要求；
     * 否则将所有x和cnt[x]个2x从arr中去掉，继续判断剩余元素是否满足题目要求。不断重复此操作，如果某个时刻arr为空，则说明arr可以满足题目要求。
     *
     * 代码实现时，我们可以用一个哈希表来统计cnt，并将其键值按绝对值从小到大排序，然后模拟上述操作，去掉元素的操作可以改为从cnt中减去对应值。
     * @param arr
     * @return
     */
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : arr) {
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        }
        if (cnt.getOrDefault(0, 0) % 2 != 0) {
            return false;
        }

        List<Integer> vals = new ArrayList<>(cnt.keySet());
        vals.sort(Comparator.comparingInt(Math::abs));
//        for (int x : cnt.keySet()) {
//            vals.add(x);
//        }
//        Collections.sort(vals, (a, b) -> Math.abs(a) - Math.abs(b));

        for (int x : vals) {
            if (cnt.getOrDefault(2 * x, 0) < cnt.get(x)) { // 无法找到足够的 2x 与 x 配对
                return false;
            }
            cnt.put(2 * x, cnt.getOrDefault(2 * x, 0) - cnt.get(x));
        }
        return true;
    }

    public static void main(String[] args) {
        int[] t = {4,-2,2,-4};
        System.out.println(new No_954_二倍数对数组().canReorderDoubled(t));
    }
}
