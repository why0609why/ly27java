package 等待唤醒模型优化;

public class SetThread implements Runnable {
    int x = 0;
    Student student;

    public SetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                student.set("林青霞", 27);
            } else {
                student.set("刘易", 30);
            }
            x++;
        }
    }
}
