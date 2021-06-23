package ProxyMode.DynamicProxy;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/22 22:28
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getObjectInstance();

// proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println("proxyInstance=" + proxyInstance.getClass());

//通过代理对象，调用目标对象的方法
        proxyInstance.teach();
        proxyInstance.sayHello("芜湖");


    }
}
