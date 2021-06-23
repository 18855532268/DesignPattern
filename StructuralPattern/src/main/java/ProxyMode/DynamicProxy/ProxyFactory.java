package ProxyMode.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/22 22:19
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getObjectInstance() {
        /**
         *     public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         *         ClassLoader loader, 指定目标对象的类加载器 获取加载器的方法固定
         *          Class<?>[] interfaces,  目标对象实现的接口类型 使用泛型方法确认类型
         *          InvocationHandler h  事情处理， 执行执行目标对象的方法时，会触发事件处理器的方法，会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("  JDK动态代理开始...");
                        Object invoke = method.invoke(target, args);
                        return invoke;
                    }
                });
    }
}
