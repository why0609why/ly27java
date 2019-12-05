package 操作构造方法;

import java.lang.reflect.Constructor;

public class 操作无参构造 {

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("操作构造方法.Person");
        //根据反射对象获得某个类的部分的构造方法
        Constructor[] constructors = c.getConstructors();
        //获得全部的构造方法,不受权限修饰符控制
//        Constructor[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        //根据形参获得指定的构造方法
        //public Constructor<T> getConstructor(Class<?>... parameterTypes),可以看到这里的参数列表是多参数的。
        Constructor constructor = c.getConstructor(int.class, String.class);
        //根据特定的形参获得指定的构造方法,不受权限修饰符控制
//        Constructor constructor1 = c.getDeclaredConstructor(int.class,String.class)

        System.out.println(constructor);
    }
}
