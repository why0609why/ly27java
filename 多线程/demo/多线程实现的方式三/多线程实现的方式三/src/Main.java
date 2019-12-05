import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.submit(new MyCallable());
        pool.submit(new MyCallable());

        pool.shutdown();
    }
}
