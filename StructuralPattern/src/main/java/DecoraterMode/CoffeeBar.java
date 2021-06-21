package DecoraterMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/16 21:54
 */
public class CoffeeBar {
    public static void main(String[] args) {
        /**
         * 点一份LongBlack
         */
        Drink order = new LongBlack();
        System.out.println("费用="+order.cost());
        System.out.println("描述="+order.getDes());
        /**
         * 加一份牛奶
         */
        order = new Milk(order);
        System.out.println("加入牛奶之后费用="+order.cost());
        System.out.println("加入牛奶之后描述="+order.getDes());
    }
}
