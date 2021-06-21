package DecoraterMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/16 21:52
 */
public class Milk extends Decorator{

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
