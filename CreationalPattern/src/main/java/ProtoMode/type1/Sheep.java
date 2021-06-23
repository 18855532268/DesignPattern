package ProtoMode.type1;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/7 20:50
 */
public class Sheep implements Cloneable{
    private String name;
    private String age;
    private String sex;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    protected Object clone()  {
        Sheep sheep = null;
        try {
            sheep = (Sheep) this.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
