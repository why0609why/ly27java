package 使用Enum类;

public enum EnumTest2 {

    Up("Up"),Down("Down"),Left("Left"),Right("Right");

    private String name;

    private EnumTest2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
