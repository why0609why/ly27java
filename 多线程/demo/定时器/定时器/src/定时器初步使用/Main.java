package 定时器初步使用;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new MyTask(), 3000);

        timer.cancel();
    }



}
