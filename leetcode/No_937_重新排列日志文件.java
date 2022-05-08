
import java.util.Arrays;

public class No_937_重新排列日志文件 {
    public String[] reorderLogFiles(String[] logs) {
        int len = logs.length;
        Pair[] arr = new Pair[len];
        for (int i = 0; i < len; i++) {
            arr[i] = new Pair(logs[i], i);
        }
        Arrays.sort(arr, this::logCompare);
        String[] reordered = new String[len];
        for (int i = 0; i < len; i++) {
            reordered[i] = arr[i].log;
        }
        return reordered;
    }

    /**
     * 日志比较器
     *
     * @param p1
     * @param p2
     * @return p1 > p2 return >0; p1 = p2 return 0; p1 < p2 return <0
     */
    private int logCompare(Pair p1, Pair p2) {
        String log1 = p1.log, log2 = p2.log;
        int index1 = p1.index, index2 = p2.index;
        String[] split1 = log1.split(" ", 2);
        String[] split2 = log2.split(" ", 2);
        boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
        boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
        //All digits, keep original order
        if (isDigit1 && isDigit2) {
            return index1 - index2;
        }
        //All characters
        if (!isDigit1 && !isDigit2) {
            int sc = split1[1].compareTo(split2[1]);
            //Not 0, means they are not same
            if (sc != 0) {
                return sc;
            }
            //Use identifier to compare
            return split1[0].compareTo(split2[0]);
        }
        return isDigit1 ? 1 : -1;
    }

    class Pair {
        String log;
        int index;

        public Pair(String log, int index) {
            this.log = log;
            this.index = index;
        }
    }

}
