package AdapterMode.type1;

import AdapterMode.type2.IVoltage5V;

public class Phone {


    //充电
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.outPut5V() == 5) {
            System.out.println("电压为 5V, 可以充电~~");
        } else if (iVoltage5V.outPut5V() > 5) {
            System.out.println("电压大于 5V, 不能充电~~");
        }
    }
}
