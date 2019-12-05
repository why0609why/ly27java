public class Main {


    public static void main(String[] args) {
        MyThread t1 = new MyThread("线程一");
        MyThread t2 = new MyThread("线程二");



        t1.start();
        t2.start();
    }
}
