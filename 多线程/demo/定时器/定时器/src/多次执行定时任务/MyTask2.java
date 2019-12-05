package 多次执行定时任务;

import java.util.TimerTask;

public class MyTask2 extends TimerTask {
    int i = 0;

    @Override
    public void run() {
        System.out.println("第"+i+"次执行定时任务");
        i++;
    }
}
