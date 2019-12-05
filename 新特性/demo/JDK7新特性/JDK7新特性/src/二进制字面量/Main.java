package 二进制字面量;

public class Main {

    public static void main(String[] args) {
        //0b开头表示这是一个二进制,x就被赋值了这个二进制代表的整形值
        int x = 0b10010;
        System.out.println(x);
        //0x 表示16进制
        x = 0x100;
        System.out.println(x);
    }
}
