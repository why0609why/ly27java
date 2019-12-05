package 单例设计模式.懒汉式;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t1 = Teacher.getInstance();
        Teacher t2 = Teacher.getInstance();

        System.out.println(t1==t2);
    }
}
