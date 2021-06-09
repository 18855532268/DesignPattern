package BuilderMode.type1;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/8 21:21
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void setHouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.builderHouse();
    }
}
