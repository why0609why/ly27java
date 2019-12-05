package 操作构造方法;

import java.lang.reflect.Constructor;

public class 操作私有构造方法 {
    public static void main(String[] args) throws Exception{
        //获得字节码文件对象
        Class c = Class.forName("操作构造方法.Person");

        //获取到私有的构造方法
        Constructor constructor = c.getDeclaredConstructor(String.class);
        //因为是私有的方法,所以必须设置访问权限是true
        constructor.setAccessible(true);

        //然后就可以用私有方法造对象了
        Person person = (Person) constructor.newInstance("林青霞");
        System.out.println(person);
    }
}
