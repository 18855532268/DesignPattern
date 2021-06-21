package Flyweight;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/21 22:14
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
