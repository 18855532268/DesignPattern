package ProxyMode.Cglib;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/23 21:14
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDao instance = (TeacherDao)new ProxyFactory(teacherDao).getProxyInstance();

        instance.teach();
        instance.sayHello("芜湖");
    }
}
