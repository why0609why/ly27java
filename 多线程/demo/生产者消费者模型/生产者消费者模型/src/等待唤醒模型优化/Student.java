package 等待唤醒模型优化;

public class Student {
    private String name;
    private int age;
    //flag为false表示当前学生时刘易，true表示为林青霞
    private boolean flag;

    public synchronized void set(String name, int age) {
        if (this.flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.name = name;
        this.age = age;
        this.flag = true;
        this.notify();
    }

    public synchronized void get(){
        if (!this.flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(this.name+"-----"+this.age);

        this.flag = false;
        this.notify();
    }


}
