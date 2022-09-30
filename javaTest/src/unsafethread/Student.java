package unsafethread;

public class Student {

    private String name;
    private String code;
    private int age;
    public static int count = 0;

    public Student() {
        count++;
    }

    public Student(String name) {
        this.name = name;
        count++;
    }

    public Student(int age) {
        this.age = age;
        count++;
    }

    public Student(String name, String code, int age) {
        this.name = name;
        this.code = code;
        this.age = age;
        count++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", age=" + age +
                '}';
    }
}
