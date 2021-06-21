package DecoraterMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/16 21:52
 */
public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
