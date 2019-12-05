package 单例设计模式体验Runtime类;

import java.io.IOException;

/**
 * 可以观察Runtime类的源码发现到，Runtime类的创建是单例饿汉式的创建
 */
public class Test {
    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();
        try {
            //r.exec("shutdown -s -t 10000");
            r.exec("shutdown -a");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
