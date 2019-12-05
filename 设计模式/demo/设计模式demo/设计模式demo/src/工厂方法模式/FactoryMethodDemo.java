package 工厂方法模式;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        //拿到专门创建某个对象的工厂
        Factory factory = new DogFactory();
        //通过创建某个对象的工厂来创建某个对象
        Animal animal = factory.create();
        //通过多态调用对象的功能
        animal.eat();

        factory = new CatFactory();
        animal = factory.create();
        animal.eat();
    }
}
