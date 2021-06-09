package FactoryMode.type3.pizza;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/3 21:02
 * 这里继承抽象类必须要实现他的抽象方法
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的奶酪 pizza");
        System.out.println("北京的奶酪 pizza准备原材料");
    }
}
