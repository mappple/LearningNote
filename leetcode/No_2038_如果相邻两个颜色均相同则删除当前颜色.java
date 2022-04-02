public class No_2038_如果相邻两个颜色均相同则删除当前颜色 {
    public boolean winnerOfGame(String colors) {
        int[] freq = {0, 0};
        char cur = 'z';
        int cnt = 0;
        for (int i = 0; i < colors.length(); i++) {
            char c = colors.charAt(i);
            if (c != cur) {
                cur = c;
                cnt = 1;
            } else {
                cnt += 1;
                if (cnt >= 3) {
                    freq[cur - 'A'] += 1;
                }
            }
        }
        return freq[0] > freq[1];
    }

    public static void main(String[] args) {
        String s = "AAABABB";
        System.out.println(new No_2038_如果相邻两个颜色均相同则删除当前颜色().winnerOfGame(s));
    }
}
