# 关于这个demo
可以发现在主方法中写了三个开启线程的代码块
第一个是直接重写Thread类的run()方法
第二个是匿名内部类来重写Runnable接口的实现类
第三个是在第二个的基础上再重写Thread类的run()方法。

前两个都没什么问题，第三个会有疑问，那么第三个线程执行的到底是Runnable里面的run()方法还是Thread类里面的run()方法呢？

答案是执行的是Thread类里面的run()方法。这是一道面试题。