package BridgeMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/15 21:24
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机");

    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");

    }
}
