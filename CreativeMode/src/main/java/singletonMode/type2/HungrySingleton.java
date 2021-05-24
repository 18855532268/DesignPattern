package singletonMode.type2;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/5/24 22:10
 *
 * 这种单例模式可能会造成内存的浪费
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