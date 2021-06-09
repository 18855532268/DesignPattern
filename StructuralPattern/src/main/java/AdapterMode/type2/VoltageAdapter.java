package AdapterMode.type2;

import java.util.Optional;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/9 21:20
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    // 通过构造器传入
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int outPut5V() {
        int dst = 0;
        if (Optional.of(voltage220V).isPresent()) {
            int src = voltage220V.outPut220V();
            System.out.println("使用对象适配器，进行适配");
            dst = src / 44;
            System.out.println("适配完成，输出电压为:"+dst);
        }
        return dst;
    }
}
