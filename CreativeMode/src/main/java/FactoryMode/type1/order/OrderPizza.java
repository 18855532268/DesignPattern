package FactoryMode.type1.order;

import FactoryMode.type1.pizza.CheesePizza;
import FactoryMode.type1.pizza.GreekPizza;
import FactoryMode.type1.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/2 22:06
 */
public class OrderPizza {

    //    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType = null;
//        do {
//            orderType = getType();
//            if ("Greek".equals(orderType)) {
//                pizza = new CheesePizza();
//                pizza.setName("奶酪");
//
//            } else if ("Cheese".equals(orderType)) {
//                pizza = new GreekPizza();
//                pizza.setName("希腊");
//
//            } else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }
    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);

    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
