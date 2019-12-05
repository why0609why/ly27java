package 使用Enum类;

public class 枚举的常用方法 {
    public static void main(String[] args) {
        EnumTest3 up = EnumTest3.Up;
        EnumTest3 down = EnumTest3.Down;
        EnumTest3 left = EnumTest3.Left;
        EnumTest3 right = EnumTest3.Right;

        //比较在枚举项在枚举类中的次序
        System.out.println("********************************************************************");
        System.out.println(up.compareTo(down));
        System.out.println(up.compareTo(left));
        System.out.println(up.compareTo(right));

        //获得枚举项的name属性的值
        System.out.println("********************************************************************");
        System.out.println(up.getName());
        System.out.println(down.getName());
        System.out.println(left.getName());
        System.out.println(right.getName());

        //获得枚举项在枚举类中的次序
        System.out.println("********************************************************************");
        System.out.println(up.ordinal());
        System.out.println(down.ordinal());
        System.out.println(left.ordinal());
        System.out.println(right.ordinal());

        //获得枚举项的字符串表示
        System.out.println("********************************************************************");
        System.out.println(up.toString());
        System.out.println(down.toString());
        System.out.println(left.toString());
        System.out.println(right.toString());


        //根据枚举类型的名字来获得枚举类
        System.out.println("********************************************************************");
        EnumTest3 up1 = Enum.valueOf(EnumTest3.class, "Up");
        EnumTest3 down1 = Enum.valueOf(EnumTest3.class, "Down");
        EnumTest3 left1 = Enum.valueOf(EnumTest3.class, "Left");
        EnumTest3 right1 = Enum.valueOf(EnumTest3.class, "Right");
        System.out.println(up1);


        //获得所有的枚举类的所有值，返回的是一个数组
        System.out.println("********************************************************************");
        EnumTest3[] values = EnumTest3.values();
        for (EnumTest3 value : values) {
            System.out.println(value);
        }
    }
}
