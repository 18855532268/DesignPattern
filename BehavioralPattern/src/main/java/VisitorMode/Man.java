package VisitorMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/28 21:04
 */
public class Man extends Person{
    @Override
    void accept(Action action) {
        action.getManResult(this);
    }
}
