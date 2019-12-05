package 创建一个线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        //创建一个线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        //创建两个Runnable的实现类
        MyRunnable my1 = new MyRunnable();
        MyRunnable my2 = new MyRunnable();

        //把两个Runnable的放到线程池中
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());

        //停止线程池
        executorService.shutdown();
    }
}
