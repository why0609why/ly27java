package 装饰模式;

/**
 * 装饰抽象类,可以有子类继承并且重写call(),体现出子类的装饰特性,在子类中可以
 * 实现子类的装饰,然后再调用父类的call()方法，达到装饰的效果
 */
public abstract class PhoneDecoration implements Phone {

    private Phone p;

    public PhoneDecoration(Phone p){
        this.p = p;
    }


    public void call() {
        this.p.call();
    }
}
