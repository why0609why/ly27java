package 模板设计模式;

/**
 * GetTimeImpl2就是GetTime的另一个实现类
 */
public class GetTimeimpl2 extends GetTime {

    //同GetTimeImpl1中的demo,GetTimeImpl2自己也实现了demo()的内容,达到了板子的效果
    @Override
    protected void demo() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}
