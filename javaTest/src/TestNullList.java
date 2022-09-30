import java.util.ArrayList;
import java.util.List;

public class TestNullList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.contains(null));
    }
}
