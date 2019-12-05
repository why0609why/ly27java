package 等待唤醒模型;

public class SetStudent implements Runnable {
    private Student student;
    private int x = 0;

    SetStudent(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (student) {
                //如果存在对象就等待(生产者就不生产)
                if (student.flag) {
                    try {
                        //并且此时立刻释放锁
                        student.wait(); //将此线程进入等待模式。当线程被唤醒的时候就从这个地方开始进入就绪状态
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (x % 2 == 0) {
                    student.name = "学生A";
                    student.age = 18;
                } else {
                    student.name = "学生B";
                    student.age = 20;
                }
                x++;
                student.flag = true;
                student.notify();   //唤醒当前这个对象锁的某个线程，这里一定就是GetStudent线程了。
            }
        }
    }
}