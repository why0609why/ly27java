package 测试同步方法锁的对象;

public class SynchronizedTest implements Runnable {
    int ticket = 10000;
    //这里随便定义一个锁
    Object object = new Object();
    int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                //把有关于票的操作全都锁起来
                synchronized (this) {
                    if (ticket>0){
                        System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket+
                                "张票");
                        ticket--;
                    }
                }
            }else {
                sell();
            }
            x++;
        }
    }

    private synchronized void sell() {
        //把有关于票的操作全都锁起来
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket+
                        "张票");
                ticket--;
            }
    }
}
