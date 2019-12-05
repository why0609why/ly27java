package 一个基础的模型;

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
                if (x % 2 == 0) {
                    student.name = "林青霞";
                    student.age = 27;
                    System.out.println(student);
                } else {
                    student.name = "刘易";
                    student.age = 30;
                    System.out.println(student);
                }
                x++;
            }
        }
    }
}
