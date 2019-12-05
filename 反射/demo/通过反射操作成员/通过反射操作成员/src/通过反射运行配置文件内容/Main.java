package 通过反射运行配置文件内容;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception{
        //如果想一直调用不同对象的love方法,如果不用反射就得一直new不同的对象,一直改代码,很不方便
        Student student = new Student();
        student.love();
        Teacher teacher = new Teacher();
        teacher.love();
        Worker worker = new Worker();
        worker.love();

        System.out.println("***********************************************");

        //现在用反射来完成同样的需求
        //从配置文件中读取到配置文件的键值对的值
        Properties prop = new Properties();
        FileReader fr = new FileReader("src/通过反射运行配置文件内容/class.txt");
        prop.load(fr);
        fr.close();
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //通过反射创建对象
        Class c = Class.forName(className);
        Constructor constructor = c.getConstructor();
        Object o = constructor.newInstance();

        //通过成员方法对象来调用通过反射创建的对象的成员方法
        Method method = c.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);
    }
}
