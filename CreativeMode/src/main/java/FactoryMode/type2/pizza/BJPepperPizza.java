package FactoryMode.type2.pizza;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/3 21:02
 * 这里继承抽象类必须要实现他的抽象方法
 */
public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的胡椒 pizza");
        System.out.println("北京的胡椒 pizza准备原材料");
    }
}
