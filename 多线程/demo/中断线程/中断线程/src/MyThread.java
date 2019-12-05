public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("线程开始执行");

        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            System.out.println("线程被终结啦");
        }

        System.out.println("线程执行完毕");
    }
}
