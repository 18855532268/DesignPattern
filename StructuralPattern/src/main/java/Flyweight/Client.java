package Flyweight;

/**
 * @author yaoby
 * @version 1.0 享元模式的本质是缓存共享对象，降低内存消耗。
 * @date 2021/6/21 22:11
 * 享元模式的主要角色有如下。
 * 抽象享元角色（Flyweight）：是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
 * 具体享元（Concrete Flyweight）角色：实现抽象享元角色中所规定的接口。
 * 非享元（Unsharable Flyweight)角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
 * 享元工厂（Flyweight Factory）角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite site1 = factory.getWebSiteCategory("新闻");
        site1.use(new User("小明"));
        WebSite site2 = factory.getWebSiteCategory("博客");
        site2.use(new User("小红"));
        WebSite site3 = factory.getWebSiteCategory("博客");
        site3.use(new User("小蓝"));
        System.out.println(factory.getWebSizeCount());
    }

}
