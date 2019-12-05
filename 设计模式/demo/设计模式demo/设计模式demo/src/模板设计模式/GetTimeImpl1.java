package 模板设计模式;

/**
 * GetTimeImpl1就是GetTime的一个实现类
 */
public class GetTimeImpl1 extends GetTime {

    //在GetTimeImpl1类中自己实现了demo()的具体内容,这里GetTimeImpl1的具体内容是for循环100遍
    @Override
    protected void demo() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
