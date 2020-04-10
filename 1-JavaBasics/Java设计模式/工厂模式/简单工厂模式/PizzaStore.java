package Java设计模式.工厂模式.简单工厂模式;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class PizzaStore {

    public static void main(String[] args){
        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }
}
