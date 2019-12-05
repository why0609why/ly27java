package 模板设计模式;

/**
 * GetTime这个抽象类就相当于一个板子
 */
public abstract class GetTime {
    //这个方法的功能就是用来计算demo()方法的执行时间,但是demo()方法的具体内容是任意多变的。
    public Long getTime() {
        long start = System.currentTimeMillis();
        demo();
        long end = System.currentTimeMillis();
        return end - start;
    }

    //所以这里采用将demo设置为抽象的,demo()方法的具体实现由实现类来决定
    abstract void demo();
}
