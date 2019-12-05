package tt;

public class MyRunnable implements Runnable {
    int ticket = 100;

    @Override
    public void run() {

        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出了第" + ticket +
                        "票");
                ticket--;
            }
        }

    }
}
