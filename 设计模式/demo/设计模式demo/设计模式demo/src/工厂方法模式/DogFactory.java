package 工厂方法模式;

/**
 * 实现了父接口Factory，而且返回了狗对象，说明这个工厂对象就是创建狗对象的工厂
 * 这个工厂就是为狗服务的
 */
public class DogFactory implements Factory {
    /**
     * 返回狗对象
     * @return
     */
    @Override
    public Animal create() {
        return new Dog();
    }
}
