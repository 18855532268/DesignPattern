package AdapterMode.type1;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/9 21:20
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int outPut5V() {
        int srcV = outPut220V();
        int dstV = srcV / 44; // 转成5v
        return dstV;
    }
}
