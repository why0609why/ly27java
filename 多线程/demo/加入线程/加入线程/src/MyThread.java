public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
        System.out.println(Thread.currentThread().getName()+"线程执行完毕啦-----------------");
    }


}
