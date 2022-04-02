import java.util.ArrayList;
import java.util.List;

public class No_682_棒球比赛 {
    public int calPoints(String[] ops) {
        List<Integer> resList = new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "C":
                    resList.remove(resList.size() - 1);
                    break;
                case "D":
                    int pre = resList.get(resList.size() - 1);
                    resList.add(pre * 2);
                    break;
                case "+":
                    int pre1 = resList.get(resList.size() - 1);
                    int pre2 = resList.get(resList.size() - 2);
                    resList.add(pre1 + pre2);
                    break;
                default:
                    int cur = Integer.parseInt(ops[i]);
                    resList.add(cur);
                    break;
            }
        }
        //int sum1 = resList.stream().reduce(0, Integer::sum);
        return resList.stream().mapToInt(num -> num).sum();
    }

    public static void main(String[] args) {
        String[] test = {"5", "2", "C", "D", "+"};
        String[] test2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(new No_682_棒球比赛().calPoints(test2));
    }
}
