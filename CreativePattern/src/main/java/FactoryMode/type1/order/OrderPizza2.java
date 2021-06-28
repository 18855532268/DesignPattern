package FactoryMode.type1.order;

import FactoryMode.type1.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/2 22:06
 */
public class OrderPizza2 {


    // 静态工厂

    public OrderPizza2() {
        String orderType = "";
        Pizza pizza = null;
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza(getType());
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
