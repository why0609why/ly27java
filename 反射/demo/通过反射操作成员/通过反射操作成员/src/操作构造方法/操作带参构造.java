package 操作构造方法;

import java.lang.reflect.Constructor;

public class 操作带参构造 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("操作构造方法.Person");

        Constructor constructor = c.getConstructor(int.class,String.class);

        //这里构造方法本身就是一个对象,所以可以调用这个构造方法产生指定的对象
        Person person = (Person) constructor.newInstance(27, "林青霞");
        System.out.println(person);
    }
}
