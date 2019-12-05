package 使用Enum类;

public enum EnumTest3 {

    Up("Up"){
        @Override
        public void show() {
            System.out.println(this.getName());
        }
    },
    Down("Down"){
        @Override
        public void show() {
            System.out.println(this.getName());
        }
    },Left("Left"){
        @Override
        public void show() {
            System.out.println(this.getName());
        }
    },Right("Right"){
        @Override
        public void show() {
            System.out.println(this.getName());
        }
    };

    private String name;

    private EnumTest3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
