package 装饰模式;

public class Main {
    public static void main(String[] args) {

        //造一个实现了接口的实现类
        Phone phone = new IPhone();
        //创建一个继承了抽象装饰类的装饰子类
        RingPhoneDecoration rpd = new RingPhoneDecoration(phone);
        //调用后发现实现了装饰效果
        rpd.call();

        //再造一个装饰类,用来装饰phone对象
        MusicPhoneDecoration mpd = new MusicPhoneDecoration(phone);
        mpd.call();
        System.out.println("--------");

        //采用多个装饰器,注意这里一个装饰器的对象可以作为另一个装饰器装饰的对象
        PhoneDecoration pd = new RingPhoneDecoration(new MusicPhoneDecoration(phone));
        //调用发现两个装饰器都装饰在了phone对象上。
        pd.call();

    }
}
