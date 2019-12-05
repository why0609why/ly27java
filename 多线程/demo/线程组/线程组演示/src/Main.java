public class Main {

    public static void main(String[] args) {
        //method1();
        method2();
    }

    /**
     * 创建自己的线程组
     */
    private static void method2() {
        //创建一个新的线程组
        ThreadGroup tg = new ThreadGroup("一个新的线程组");
        MyRunnable my = new MyRunnable();

        //在创建线程的时候指定线程的线程组
        Thread t1 = new Thread(tg, my, "线程1");
        Thread t2 = new Thread(tg, my, "线程2");

        //通过线程组一次性设置多个线程为后台线程
        tg.setDaemon(true);
        //通过线程组一次性设置多个线程的优先级
        tg.setMaxPriority(10);

        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());


    }


    /**
     * 看线程默认所属的线程组
     */
    private static void method1() {
        MyRunnable my = new MyRunnable();

        Thread t1 = new Thread(my, "线程1");
        Thread t2 = new Thread(my, "线程2");

        ThreadGroup tg = t1.getThreadGroup();
        ThreadGroup tg2 = t1.getThreadGroup();

        //可以发现所有的线程默认都是主线程组
        System.out.println(tg.getName());
        System.out.println(tg2.getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());

//        t1.start();
//        t2.start();
    }
}
