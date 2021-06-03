package FactoryMode.type3.order;



import FactoryMode.type3.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/2 22:06
 *
 */
public  class OrderPizza {

   AbsFactory factory;
   public OrderPizza(AbsFactory factory){
       setFactory(factory);
   }

   public void  setFactory(AbsFactory factory){
       Pizza pizza = null;
       String orderType = null;
       this.factory = factory;
       do {
           orderType = getType();
           pizza = factory.createPizza(orderType); // 抽象方法，由工厂子类完成  关键点
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
