package AdapterMode.type1;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/9 21:16
 */
public class Voltage220V {
    // 输出220v电压
    public int outPut220V() {
        int src = 220;
        System.out.println("电压:" + src + "V");
        return src;
    }
}
