package SingletonMode.type7;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/5/24 22:10
 * <p>
 * 借助JDK1.5添加枚举来实现单例模式，不仅避免多线程同步问题，而且防止反序列化重新创建对象
 */
public class EnumSingleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance1:" + instance1.hashCode());

    }

}

// 使用枚举可以实现单例
enum Singleton {
    INSTANCE;

    public void sayOk() {
        System.out.println("ok");
    }
}