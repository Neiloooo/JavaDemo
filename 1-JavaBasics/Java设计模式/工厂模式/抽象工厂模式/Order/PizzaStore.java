package Java设计模式.工厂模式.抽象工厂模式.Order;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class PizzaStore {

    public static void  main(String[] args){

        new OrderPizza(new BJFactory());

    }
}
