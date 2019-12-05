package 等待唤醒模型优化;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        SetThread st = new SetThread(student);
        GetThread gt = new GetThread(student);

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(gt);

        t1.start();
        t2.start();
    }
}
