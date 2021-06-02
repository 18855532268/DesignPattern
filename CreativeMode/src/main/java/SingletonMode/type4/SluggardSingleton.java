package SingletonMode.type4;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/5/24 22:10
 * <p>
 * 优缺点  这种确实保证了线程安全 但是效率太低 每个线程在想获得类的实例的时候，都需要等待，同步效率太低
 */
public class SluggardSingleton {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());


    }

}

// 懒汉式（线程安全 ）
class Singleton {
    private static Singleton instance;

    // 构造器私有化
    private Singleton() {

    }
    // 本类内部创建对象实例

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}