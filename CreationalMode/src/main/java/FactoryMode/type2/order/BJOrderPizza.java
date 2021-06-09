package FactoryMode.type2.order;



import FactoryMode.type2.pizza.BJCheesePizza;
import FactoryMode.type2.pizza.BJPepperPizza;
import FactoryMode.type2.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/2 22:06
 */
public class BJOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
