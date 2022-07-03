import java.util.ArrayList;
import java.util.List;

public class ObjTest {


    public static void main(String[] args) {
        List<User> resList = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            User user = new User();
            user.setSex(i+"");
            user.setName("tu"+i);
            resList.add(user);
        }
        System.out.println(resList);
    }
}
