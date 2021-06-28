package VisitorMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/28 21:06
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给他的评价是失败");

    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给他的评价是失败");

    }
}
