package 加锁之后卖票;

public class Main2 {

    public static void main(String[] args) {
        SynchronizedTest synchronizedTest = new SynchronizedTest();

        Thread t1 = new Thread(synchronizedTest,"窗口1");
        Thread t2 = new Thread(synchronizedTest,"窗口2");
        Thread t3 = new Thread(synchronizedTest,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }


}
