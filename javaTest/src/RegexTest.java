public class RegexTest {


    public static void main(String[] args) {
        String tmp = "https://www.baidu.com/.{3}+/ac=.{3}";

        String t1 = "https://www.baidu.com/123/ac=1234";
        System.out.println(t1.matches(tmp));
    }
}
