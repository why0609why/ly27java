package 动态代理初体验;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        System.out.println("*************************************************************************");
        //传统的调用CRUD长这个样子
        StudentDao sd = new StudentDaoImpl();
        sd.add();
        sd.delete();
        sd.update();
        sd.find();
        System.out.println("*************************************************************************");



        System.out.println("*************************************************************************");
        //但是如果想在CRUD之前做一个权限验证,在CRUD后做一个日志记录呢？
        //只能修改StudentDaoImpl的源码？
        //如果还要再加一个记录CRUD次数的功能呢？再修改源码？
        //所以这里引入动态代理
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(sd);
        StudentDao proxy = (StudentDao) Proxy.newProxyInstance(sd.getClass().getClassLoader(),
                sd.getClass().getInterfaces(), myInvocationHandler);
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.find();

    }
}
