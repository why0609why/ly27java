public class Main {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("线程1");
        MyThread t2 = new MyThread("线程2");
        MyThread t3 = new MyThread("线程3");


        t1.start();

        t2.start();
//启动线程1之后使线程1变为加入线程
        try {
            t1.join();
            System.out.println("执行到了t1.join()");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();

    }
}
