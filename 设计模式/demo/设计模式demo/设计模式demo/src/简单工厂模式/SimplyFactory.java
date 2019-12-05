package 简单工厂模式;

/**
 * 通过传入对象的名字一个方法来创建所有的对象
 */
public class SimplyFactory {

    private SimplyFactory() {
    }

    //简单工厂中只有一个创建所有对象的方法
    public static Animal createAnimal(String name) {
        if (name.equals("Dog")){
            return new Dog();
        }else if (name.equals("Cat")){
            return new Cat();
        }else {
            return null;
        }
    }

}
