public class Main {

    public static void main(String[] args) {
        MyThread t1 = new MyThread(true);
        MyThread t2 = new MyThread(false);

        t1.start();
        t2.start();
    }
}
