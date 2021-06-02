package FactoryMode.type1.order;

import FactoryMode.type1.pizza.CheesePizza;
import FactoryMode.type1.pizza.GreekPizza;
import FactoryMode.type1.pizza.Pizza;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/2 22:33
 */
public class SimpleFactory {
//    public Pizza createPizza(String orderType) {
//        Pizza pizza = null;
//        System.out.println("使用简单工厂模式");
//
//        if ("Greek".equals(orderType)) {
//            pizza = new CheesePizza();
//            pizza.setName("奶酪");
//
//        } else if ("Cheese".equals(orderType)) {
//            pizza = new GreekPizza();
//            pizza.setName("希腊");
//
//        }
//        return pizza;
//    }
        public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");

        if ("Greek".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪");

        } else if ("Cheese".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊");

        }
        return pizza;
    }
}
