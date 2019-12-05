package 手动实现枚举;

public class Main {

    public static void main(String[] args) {
        System.out.println("测试MyEnum***********************************");
        System.out.println(MyEnum.Decration_Up);
        System.out.println(MyEnum.Decration_Down);
        System.out.println(MyEnum.Decration_Left);
        System.out.println(MyEnum.Decration_Right);

        System.out.println("测试MyEnum2**********************************");
        System.out.println(MyEnum2.Decration_Up.getName());
        System.out.println(MyEnum2.Decration_Down.getName());
        System.out.println(MyEnum2.Decration_Left.getName());
        System.out.println(MyEnum2.Decration_Right.getName());

        System.out.println("测试MyEnum3**********************************");
        MyEnum3.Decration_Up.show();
        MyEnum3.Decration_Down.show();
        MyEnum3.Decration_Left.show();
        MyEnum3.Decration_Right.show();

    }
}
