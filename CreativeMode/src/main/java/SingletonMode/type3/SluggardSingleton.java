package SingletonMode.type3;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/5/24 22:10
 *
 * 优缺点  起到Lazy loading 的效果 但是只能在单线程下生效
 * 如果在多线程下 一个线程进入了 if (instance == null)判断语句 还未来得及往下执行
 * 另一个线程也通过了这个语句 这个时候便会出现多个实例 所以这种在多线程情况下不可取
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

// 懒汉式（线程不安全）
class Singleton {
    // 构造器私有化
    private Singleton() {

    }
    // 本类内部创建对象实例
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}