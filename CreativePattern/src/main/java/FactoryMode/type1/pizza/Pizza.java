package FactoryMode.type1.pizza;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/2 21:57
 */
public abstract class Pizza {
    private String name;
    // 准备原材料 不同的pizza 不一样  因此抽象成一个方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking");
    }

    public void cut() {
        System.out.println(name + "cuting");
    }

    public void box() {
        System.out.println(name + "boxing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
