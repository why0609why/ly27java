package 等待唤醒模型优化;

public class GetThread implements Runnable {
    Student student;

    public GetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true) {
            student.get();
        }
    }
}
