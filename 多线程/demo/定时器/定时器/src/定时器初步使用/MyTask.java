package 定时器初步使用;

import java.util.TimerTask;

public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("定是任务执行");
    }
}
