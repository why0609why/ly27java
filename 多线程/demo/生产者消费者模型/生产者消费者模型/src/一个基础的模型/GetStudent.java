package 一个基础的模型;

public class GetStudent implements Runnable {
    private Student student;

    GetStudent(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true){
            synchronized (student) {
                System.out.println(student);
            }
        }
    }
}