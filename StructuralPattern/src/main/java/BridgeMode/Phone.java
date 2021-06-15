package BridgeMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/15 21:26
 */
public abstract class Phone {
    /**
     * 组合品牌
     */
    private Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }


    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }

}
