package t;

public class Main {
    public static void main(String[] args) {
        Object o = new Object();
        MyRunnable my1 = new MyRunnable(o);
        MyRunnable my2 = new MyRunnable(o);

        Thread t1 = new Thread(my1,"林青霞");
        Thread t2 = new Thread(my2,"刘易");

        t1.start();
        t2.start();
    }
}
