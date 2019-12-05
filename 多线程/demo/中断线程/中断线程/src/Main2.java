public class Main2 {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        //主线程执行1秒以后使线程t停止运行
        try {
            Thread.sleep(1*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //可以发现有线程t的终止后的操作
        //说明interrupt()方法只是抛出一个异常来更改线程状态
        t.interrupt();
    }
}
