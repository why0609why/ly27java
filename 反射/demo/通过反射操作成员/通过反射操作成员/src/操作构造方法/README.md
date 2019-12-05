# 这个包的demo
这个包的demo演示了一些通用的反射的操作成员的方法。比如假设c是一个字节码对象,c.getXXXs()，获得的是全部的非public修饰的XXX对象，这个XXX可以是成员变量、成员方法、构造方法。

c.getDeclaredXXXs(),获得是的全部的XXX对象。
c.getXXX(Class args)获得的是单个的XXX对象，c.getDeclaredXXX同理。

这个包操作的是构造方法。