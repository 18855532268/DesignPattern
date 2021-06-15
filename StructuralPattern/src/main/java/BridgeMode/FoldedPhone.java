package BridgeMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/15 21:31
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    public void close() {
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    public void call() {
        super.open();
        System.out.println("折叠样式手机");
    }
}
