package ProxyMode.StaticProxy;

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
}
