import java.util.concurrent.Callable;

/**
 * 实现Callable接口，重写call方法，可以发现这个多线程是可以有返回值的，很牛皮
 */
public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }

        return null;
    }
}
