package FactoryMode.type3.order;

import FactoryMode.type3.pizza.BJCheesePizza;
import FactoryMode.type3.pizza.BJPepperPizza;
import FactoryMode.type3.pizza.Pizza;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/3 21:40
 */
public class BJFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        }else if ("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
