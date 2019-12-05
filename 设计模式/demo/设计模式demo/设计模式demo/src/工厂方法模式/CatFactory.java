package 工厂方法模式;

/**
 * 实现了父接口Factory，而且返回了猫对象，说明这个工厂对象就是创建猫对象的工厂
 * 这个工厂就是为猫服务的
 */
public class CatFactory implements Factory {
    @Override
    public Animal create() {
        return new Cat();
    }
}
