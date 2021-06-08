package BuilderMode.type1;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/8 21:18
 */
public class CommonHouse extends HouseBuilder {
    @Override
    void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子砌墙");

    }

    @Override
    void roofed() {
        System.out.println("普通房子封顶");

    }
}
