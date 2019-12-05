package 加锁之后卖票;

public class SynchronizedTest implements Runnable {
    int ticket = 10000;
    //这里随便定义一个锁
    Object object = new Object();


    @Override
    public void run() {
        while (true) {
            //把有关于票的操作全都锁起来
            synchronized (object) {
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket+
                            "张票");
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}
