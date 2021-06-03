package FactoryMode.type3.order;

import FactoryMode.type3.pizza.Pizza;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/3 21:37
 */
public interface AbsFactory {
    Pizza createPizza(String orderType);
}
