public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    //控制台的结果READ.md里面有讲
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            //打印操作
            System.out.println(Thread.currentThread().getName() + "-" + i);
            //打印完之后进行线程休眠
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
