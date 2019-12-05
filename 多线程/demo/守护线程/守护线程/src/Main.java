public class Main {

    public static void main(String[] args) {
        Thread.currentThread().setName("刘备");

        MyThread t1 = new MyThread("张飞");
        MyThread t2 = new MyThread("关羽");

        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }

    }
}
