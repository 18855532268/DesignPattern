package VisitorMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/28 21:04
 * 这里使用到了双分派
 */
public class Woman extends Person {
    @Override
    void accept(Action action) {
        action.getWomanResult(this);
    }
}
