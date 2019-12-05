package 手动实现枚举;

public abstract class MyEnum3 {

    public static final MyEnum3 Decration_Up = new MyEnum3("Up"){
        @Override
        public void show() {
            System.out.println(this.getName());
        }
    };
    public static final MyEnum3 Decration_Down = new MyEnum3("Down"){
        @Override
        public void show() {
            System.out.println(this.getName());
        }
    };
    public static final MyEnum3 Decration_Left = new MyEnum3("Left"){
        @Override
        public void show() {
            System.out.println(this.getName());
        }
    };
    public static final MyEnum3 Decration_Right = new MyEnum3("Right"){
        @Override
        public void show() {
            System.out.println(this.getName());
        }
    };



    private String name;

    private MyEnum3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
