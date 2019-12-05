public class Main {

    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Person p2 = new Person();

        //第一种获取Person的Class对象的方法
        //通过对象的getClass()方法,Object里面的
        Class c1 = p1.getClass();
        Class c2 = p2.getClass();

        System.out.println(c1 == c2);

        //第二种获取Person的Class对象的方法
        Class c3 = Person.class;

        //第三种获取Person的Class对象的方法
        Class c4 = Class.forName("Person");
    }
}
