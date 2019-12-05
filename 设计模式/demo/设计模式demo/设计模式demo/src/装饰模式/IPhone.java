package 装饰模式;


/**
 * 实现了手机接口，没什么好说的
 */
public class IPhone implements Phone {
    @Override
    public void call() {
        System.out.println("IPhone打电话");
    }
}
