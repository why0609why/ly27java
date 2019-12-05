package 模板设计模式;

public class Main {
    public static void main(String[] args) {
        //看看用了GetTime这个板子的实现类的效果
        GetTime gt = new GetTimeImpl1();
        System.out.println(gt.getTime());

        //GetTime的另一个实现类的效果
        gt = new GetTimeimpl2();
        System.out.println(gt.getTime());
    }
}
