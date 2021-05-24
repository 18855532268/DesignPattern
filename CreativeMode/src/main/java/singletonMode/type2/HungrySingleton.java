package singletonMode.type2;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/5/24 22:10
 *
 * 和静态变量的方式一样 优缺点也相同
 * 只不过是将实例化过程放在了静态代码块中
 * 也是在类加载的时候执行静态代码块种的方法 初始化类实例
 */
public class HungrySingleton {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());


    }

}

// 饿汉式（静态代码块）
class Singleton {
    // 构造器私有化
    private Singleton() {

    }
    // 在静态代码块中创建对象
    static {
        instance = new Singleton();
    }
    // 本类内部创建对象实例
    private final static Singleton instance;

    public static Singleton getInstance() {
        return instance;
    }
}