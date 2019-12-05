package 接口新特性;

public interface MyInterface {
    static void f1(){
        System.out.println("调用了静态f1方法");
    }

    default void f2(){
        System.out.println("调用了默认f2方法");
    }

    public abstract void f3();

}
