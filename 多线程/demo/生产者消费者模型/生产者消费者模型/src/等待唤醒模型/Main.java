package 等待唤醒模型;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        SetStudent setStudent = new SetStudent(student);
        GetStudent getStudent = new GetStudent(student);

        Thread t1 = new Thread(setStudent);
        Thread t2 = new Thread(getStudent);

        t1.start();
        t2.start();
    }
}
