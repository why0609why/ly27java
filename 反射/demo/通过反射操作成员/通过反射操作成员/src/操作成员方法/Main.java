package 操作成员方法;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("操作成员方法.Person");
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        System.out.println("--------------------------------------");

        //获得show()方法的那个变量
        Method m1 = c.getMethod("show");
        //通过反射创建person对象
        Constructor constructor = c.getDeclaredConstructor(int.class, String.class);
        Person person = (Person) constructor.newInstance(27, "林青霞");
        //传入person对象,调用show()方法对象调用show()方法
        Object invoke = m1.invoke(person);
        System.out.println(invoke);

        //获得show2()方法对象
        Method m2 = c.getDeclaredMethod("show2", String.class);
        //因为show2()方法是private修饰的,所以要强制访问,所以设置访问许可时true
        m2.setAccessible(true);
        m2.invoke(person,"hello");

        //获得show3()方法对象
        Method m3 = c.getDeclaredMethod("show3");
        //嗲用show3()方法并且获得返回值
        String res = (String) m3.invoke(person);
        System.out.println(res);
    }
}
