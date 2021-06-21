package DecoraterMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/16 21:27
 */
public abstract class Drink {
    public String des;
    private float price;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
     public abstract float cost();

}
