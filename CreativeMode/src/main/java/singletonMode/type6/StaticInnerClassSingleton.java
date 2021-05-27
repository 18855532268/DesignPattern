//package singletonMode.type6;
//
///**
// * @author yaoby
// * @version 1.0
// * @date 2021/5/24 22:10
// * <p>
// * 优缺点  这种既保证了线程安全，又保证了效率问题 同时解决了懒加载的问题  推荐使用
// */
//public class StaticInnerClassSingleton {
//    public static void main(String[] args) {
//        Singleton instance1 = Singleton.getInstance();
//        Singleton instance2 = Singleton.getInstance();
//        System.out.println(instance1 == instance2);
//        System.out.println(instance1.hashCode());
//        System.out.println(instance2.hashCode());
//
//
//    }
//
//}
//
//// 懒汉式（线程安全 双重检查）
//class Singleton {
//    private static volatile Singleton instance;
//
//    // 构造器私有化
//    private Singleton() {
//    }
//    // 写一个静态内部类 该类中有一个静态属性Singleton
//    private static class SingletonInstance{
//        private static final Singleton INSTANCE  = new Singleton();
//
//    }
//    public static synchronized Singleton getInstance(){
//        return SingletonInstance.INSTANCE();
//    }
//
//}