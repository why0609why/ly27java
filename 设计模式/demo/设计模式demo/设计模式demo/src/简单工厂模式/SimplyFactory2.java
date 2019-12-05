package 简单工厂模式;

/**
 * 每个对象都有属于自己的创建对象的方法，每个对象创建自己的对象的时候只需要找到自己对应的方法就行
 */
public class SimplyFactory2 {

    private SimplyFactory2() {
    }

    /**
     * 创建狗对象
     * @return
     */
    public static Dog createDog() {
        return new Dog();
    }

    /**
     * 创建猫对象
     * @return
     */
    public static Cat createCat() {
        return new Cat();
    }
}
