/**
 * 继承Thread类创建线程
 * 1. 继承Thread类
 * 2. 重写run方法
 * 3. 在主程序new自己写的线程类对象
 * 4. 调用对象的start()方法表示开启了一个线程
 */
public class MyThread extends Thread {

    //调用父类的构造方法来赋值
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            //Thread.currentThread()获取当前线程的对象
            System.out.println(i+"-"+Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName()+"执行完毕");
    }
}
