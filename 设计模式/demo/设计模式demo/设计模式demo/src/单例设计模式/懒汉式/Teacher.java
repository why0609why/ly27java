package 单例设计模式.懒汉式;

public class Teacher {
    private Teacher(){
    }

    private static Teacher teacher = null;

    //线程安全的懒汉式
    public synchronized static Teacher getInstance(){
        if (teacher == null){
            teacher = new Teacher();
        }
        return teacher;
    }
}
