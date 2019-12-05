package t;

import javax.naming.event.ObjectChangeListener;

public class MyRunnable implements Runnable {
    Object object;

    public MyRunnable(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (object) {
                System.out.println(Thread.currentThread().getName()+"---"+i);
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
