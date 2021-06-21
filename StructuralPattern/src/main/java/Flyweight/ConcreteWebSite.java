package Flyweight;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/21 22:02
 */
public class ConcreteWebSite extends WebSite {
    /**
     * 网站发布的形式
     */
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(" 网站发布的形式：" + type + "使用中。。。使用者" + user.getName());
    }
}
