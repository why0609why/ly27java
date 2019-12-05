package 数字字面量可以出现下划线;

public class Main {
    public static void main(String[] args) {
        //定义一个x的值为100010001,但是这样看起来比较长，不太方便
        int x = 100010001;
        System.out.println(x);

        //这个x的值和上面的值是一样的
        x = 1000_1000_1;
        System.out.println(x);
    }
}
