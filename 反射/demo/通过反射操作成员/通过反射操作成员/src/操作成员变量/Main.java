package 操作成员变量;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("操作成员变量.Person");

        //获取到全部的非public修饰得成员变量
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        //获得全部权限修饰得成员变量
        Field[] declaredFields = c.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Constructor constructor = c.getDeclaredConstructor(int.class, String.class);
        Person person = (Person) constructor.newInstance(27, "林青霞");
        Field id = c.getDeclaredField("id");
        id.setAccessible(true);
        id.set(person, 22);
        System.out.println(person);

    }
}
