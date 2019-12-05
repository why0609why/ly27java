public class Main {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("线程1");
        MyThread t2 = new MyThread("线程2");
        MyThread t3 = new MyThread("线程3");

        t1.start();
        t2.start();
        t3.start();
    }
}
