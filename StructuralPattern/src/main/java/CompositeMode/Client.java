package CompositeMode;

/**
 * 组合模式的主要优点有：
 * 组合模式使得客户端代码可以一致地处理单个对象和组合对象，无须关心自己处理的是单个对象，还是组合对象，这简化了客户端代码；
 * 更容易在组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码，满足“开闭原则”；
 *
 * 其主要缺点是：
 * 设计较复杂，客户端需要花更多时间理清类之间的层次关系；
 * 不容易限制容器中的构件；
 * 不容易用继承的方法来增加构件的新功能；
 */
public class Client {


    public static void main(String[] args) {
// TODO Auto-generated method stub

//从大到小创建对象 学校
        OrganizationComponent university = new University("清华大学", " 中国顶级大学 ");

//创建 学院
        OrganizationComponent computerCollege = new College(" 计 算 机 学 院 ", " 计 算 机 学 院 ");
        OrganizationComponent infoEngineercollege = new College("信息工程学院", " 信息工程学院 ");


//创建各个学院下面的系(专业)
        computerCollege.add(new Department("软件工程", " 软件工程不错 "));
        computerCollege.add(new Department("网络工程", " 网络工程不错 "));
        computerCollege.add(new Department("计算机科学与技术", " 计算机科学与技术是老牌的专业 "));


//
        infoEngineercollege.add(new Department("通信工程", " 通信工程不好学 "));
        infoEngineercollege.add(new Department("信息工程", " 信息工程好学 "));

//将学院加入到 学校
        university.add(computerCollege);
        university.add(infoEngineercollege);


        university.print();
        infoEngineercollege.print();
    }


}
