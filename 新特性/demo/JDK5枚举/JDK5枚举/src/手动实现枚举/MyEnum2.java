package 手动实现枚举;

public class MyEnum2 {

    public static final MyEnum2 Decration_Up = new MyEnum2("Up");
    public static final MyEnum2 Decration_Down = new MyEnum2("Down");
    public static final MyEnum2 Decration_Left = new MyEnum2("Left");
    public static final MyEnum2 Decration_Right = new MyEnum2("Right");



    private String name;

    private MyEnum2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
