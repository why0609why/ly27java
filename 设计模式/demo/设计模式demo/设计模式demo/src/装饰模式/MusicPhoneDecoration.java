package 装饰模式;

/**
 * 装饰子类,这里给增加一个在调用了打电话功能之后的调用音乐的功能。
 */
public class MusicPhoneDecoration extends PhoneDecoration {
    public MusicPhoneDecoration(Phone p) {
        super(p);
    }

    //可以发现这里需要调用了抽象类中的方法，再调用了自己增加的内容，看上去就像加了一层装饰
    @Override
    public void call() {
        super.call();
        System.out.println("调用音乐功能");
    }
}
