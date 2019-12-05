package 多次执行定时任务;

import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new MyTask2(), 3000, 2000);
    }
}
