import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {
    Lock lock = new ReentrantLock();
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            lock.lock();

            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket--+"张票");
            }

            lock.unlock();
        }
    }
}
