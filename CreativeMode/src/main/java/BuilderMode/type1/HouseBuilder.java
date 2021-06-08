package BuilderMode.type1;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/8 21:12
 */
public abstract class HouseBuilder {
    House house = new House();

    abstract void buildBasic();

    abstract void buildWalls();

    abstract void roofed();

    public House builderHouse(){
        return house;
    }
}
