import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ObjTest {


    public static void main(String[] args) {
//        List<User> resList = new ArrayList<>();
//
//
//        for (int i = 0; i < 3; i++) {
//            User user = new User();
//            user.setSex(i+"");
//            user.setName("tu"+i);
//            resList.add(user);
//        }
//        System.out.println(resList);
        Map<String, Object> map = new HashMap<>();
        map.put("123", "123");
        System.out.println(map.containsKey(Optional.ofNullable(null).orElse("123")));

        String i = "我";
        System.out.println(i.length());
    }
}
