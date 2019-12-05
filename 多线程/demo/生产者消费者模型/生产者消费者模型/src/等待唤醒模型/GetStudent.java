package 等待唤醒模型;


public class GetStudent implements Runnable {
    private Student student;

    GetStudent(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (student) {
                if (!student.flag) {
                    try {
                        student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(student);
                student.flag = false;
                student.notify();
            }
        }
    }
}
