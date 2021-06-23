package ProxyMode.DynamicProxy;


/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/22 22:13
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中.....");
    }

    @Override
    public void sayHello(String name) {
// TODO Auto-generated method stub
        System.out.println("hello " + name);
    }

}
