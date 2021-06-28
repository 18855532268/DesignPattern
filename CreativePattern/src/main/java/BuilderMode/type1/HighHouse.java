package BuilderMode.type1;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/8 21:18
 */
public class HighHouse extends HouseBuilder {
    @Override
    void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    void buildWalls() {
        System.out.println("高楼房子砌墙");

    }

    @Override
    void roofed() {
        System.out.println("高楼房子封顶");

    }
}
