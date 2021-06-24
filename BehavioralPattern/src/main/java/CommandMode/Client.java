package CommandMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/24 20:57
 */
public class Client {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();

    }
}
