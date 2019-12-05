package 单例设计模式.饿汉式;

public class Student {

    //私有构造方法，不让外界new对象
    private Student() {
    }

    //私有静态单例对象
    private static Student s = new Student();

    //通过公有方法让外界访问对象
    public static Student getInstance() {
        return s;
    }
}
