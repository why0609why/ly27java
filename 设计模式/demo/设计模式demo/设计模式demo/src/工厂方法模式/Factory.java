package 工厂方法模式;

/**
 * 所有创建对象的工厂的父接口，规定了下面的工厂必须都是创建对象的工厂
 */
public interface Factory {
    public abstract Animal create();
}
