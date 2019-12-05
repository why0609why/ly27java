public class Main {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("线程1");
        MyThread t2 = new MyThread("线程2");

        //线程优先级默认5，范围1~10
        //优先级高只是说明线程抢到执行权的概率高，并不是一直霸占执行权
        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}
