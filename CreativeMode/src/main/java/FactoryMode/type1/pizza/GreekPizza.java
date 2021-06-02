package FactoryMode.type1.pizza;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/2 21:59
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
