package 使用Enum类;

public class Main {
    public static void main(String[] args) {

        System.out.println("EnumTest1的测试***************************");
        EnumTest1 et1 = EnumTest1.Up;
        EnumTest1 et2 = EnumTest1.Down;
        EnumTest1 et3 = EnumTest1.Left;
        EnumTest1 et4 = EnumTest1.Right;

        System.out.println("EnumTest2的测试***************************");
        System.out.println(EnumTest2.Up.getName());
        System.out.println(EnumTest2.Down.getName());
        System.out.println(EnumTest2.Left.getName());
        System.out.println(EnumTest2.Right.getName());

        System.out.println("EnumTest3的测试***************************");
        EnumTest3.Up.show();
        EnumTest3.Down.show();
        EnumTest3.Left.show();
        EnumTest3.Right.show();

        System.out.println("switch的测试***************************");
        EnumTest3 dd = EnumTest3.Up;
        switch (dd) {
            case Up:
                System.out.println("Up");
                break;
            case Down:
                System.out.println("Down");
                break;
            case Left:
                System.out.println("Left");
                break;
            case Right:
                System.out.println("Right");
                break;
        }
    }
}
