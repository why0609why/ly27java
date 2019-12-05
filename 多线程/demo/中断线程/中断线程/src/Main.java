public class Main {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        //主线程执行1秒以后使线程t停止运行
        try {
            Thread.sleep(1*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //把线程t调用stop方法之后发现并没有线程t执行结束的标志
        //说明stop方法过于暴力，直接停止线程
        t.stop();
    }
}
