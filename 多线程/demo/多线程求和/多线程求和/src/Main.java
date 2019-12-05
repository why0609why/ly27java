import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建两个有各自的特点的线程
        MyCallable my1 = new MyCallable(1,100);
        MyCallable my2 = new MyCallable(1,50);

        //创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);

        //线程池放入线程
        Future<Integer> s1 = pool.submit(my1);
        Future<Integer> s2 = pool.submit(my2);

        //通过future对象的get方法获得线程的返回值
        Integer i1 = s1.get();
        Integer i2 = s2.get();

        System.out.println(i1);
        System.out.println(i2);

        //停止线程池
        pool.shutdown();
    }
}
