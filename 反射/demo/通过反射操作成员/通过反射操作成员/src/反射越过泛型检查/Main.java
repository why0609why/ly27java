package 反射越过泛型检查;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        //先添加一个整形元素
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);

        //通过反射给集合添加一个字符串元素
        Class c = arrayList.getClass();
        Method m = c.getMethod("add", Object.class);
        m.invoke(arrayList, "hello");

        //打印发现添加成功
        System.out.println(arrayList);
    }
}
