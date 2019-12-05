package 操作成员方法;

public class Person {
    private int id;
    private String name;

    public Person() {
    }

    Person(int id) {
        this.id = id;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("show方法被调用啦");
    }

    private void show2(String s){
        System.out.println(s+"---show2方法被调用了");
    }

    public String show3(){
        return "show3方法的返回值";
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}