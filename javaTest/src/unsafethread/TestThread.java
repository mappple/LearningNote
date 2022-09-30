package unsafethread;

public class TestThread {

    public static void main(String[] args) {
        //假设有两个班级,那就是要创建1个线程
        for (int i = 0; i < 2; i++) {
            new StudentThread().start();
        }

    }
}
