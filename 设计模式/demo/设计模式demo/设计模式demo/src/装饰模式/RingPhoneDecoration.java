package 装饰模式;

/**
 * 效果同MusicPhoneDecoration
 */
public class RingPhoneDecoration extends PhoneDecoration {

    public RingPhoneDecoration(Phone p) {
        super(p);
    }

    //原理同MusicPhoneDecoration
    @Override
    public void call() {
        System.out.println("调用了手机的彩铃功能");
        super.call();
    }
}
