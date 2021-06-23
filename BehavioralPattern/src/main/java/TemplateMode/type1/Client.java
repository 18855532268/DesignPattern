package TemplateMode.type1;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //制作红豆豆浆

        System.out.println("----制作红豆豆浆----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("---- 制 作 花 生 豆 浆 ----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

    }

}
