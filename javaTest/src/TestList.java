import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("111");
        test.add("222");
        test.add("333");
        for (String s : test) {
            s = s.substring(0, 1);
        }
        System.out.println(test);
    }

}
