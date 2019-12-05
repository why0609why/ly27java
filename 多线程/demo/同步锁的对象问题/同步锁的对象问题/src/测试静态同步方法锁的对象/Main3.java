package 测试静态同步方法锁的对象;

import 测试同步方法锁的对象.SynchronizedTest;

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        StaticSynchronizedTest staticSynchronizedTest = new StaticSynchronizedTest();

        Thread t1 = new Thread(staticSynchronizedTest,"线程1");
        Thread t2 = new Thread(staticSynchronizedTest,"线程2");
        Thread t3 = new Thread(staticSynchronizedTest, "线程3");

        t1.start();
        t2.start();
        t3.start();
    }
}
