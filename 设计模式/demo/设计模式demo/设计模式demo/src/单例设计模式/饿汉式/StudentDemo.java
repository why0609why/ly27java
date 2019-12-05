package 单例设计模式.饿汉式;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();

        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
