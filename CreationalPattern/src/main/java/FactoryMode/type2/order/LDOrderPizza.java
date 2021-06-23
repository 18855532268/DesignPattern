package FactoryMode.type2.order;



import FactoryMode.type2.pizza.*;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/2 22:06
 */
public class LDOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
