package FactoryMode.type3.order;

import FactoryMode.type3.pizza.*;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/3 21:40
 */
public class LDFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        }else if ("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
