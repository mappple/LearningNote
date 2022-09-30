package unsafethread;

public class StudentThread extends Thread {
    @Override
    public void run() {
        //每个班级创建20个人,循环一次创建两个人
        for (int i = 0; i < 10; i++) {
            Student s = new Student();
            System.out.print(Student.count + " ");
            Student s1 = new Student(i);
            System.out.print(Student.count + " ");
        }
    }
}

