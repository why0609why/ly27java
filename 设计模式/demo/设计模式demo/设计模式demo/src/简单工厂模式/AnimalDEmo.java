package 简单工厂模式;

public class AnimalDEmo {
    public static void main(String[] args) {
        //传统使用对象功能的方法
        //method1();

        //用了第一种简单工厂来调用对象的功能
        //method2();

        //用了第二种简单工厂来调用对象的功能
        method3();
    }

    /**
     * 传统使用对象功能的方法
     */
    private static void method1() {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.eat();
    }

    /**
     * 用了第一种简单工厂来调用对象的功能
     */
    private static void method2() {
        Animal animal1 = SimplyFactory.createAnimal("Dog");
        Animal animal2 = SimplyFactory.createAnimal("Cat");
        Animal animal3 = SimplyFactory.createAnimal("Pig");

        animal1.eat();
        animal2.eat();
        if (animal3!=null){
            animal3.eat();
        }else {
            System.out.println("暂时没有这种动物，需要更改简单工厂源码才能加入此种动物");
        }
    }

    /**
     * 用了第二种简单工厂来调用对象的功能
     */
    private static void method3() {
        Dog dog = SimplyFactory2.createDog();
        Cat cat = SimplyFactory2.createCat();

        dog.eat();
        cat.eat();
    }
}
