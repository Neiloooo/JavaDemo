package Java设计模式.工厂模式.抽象工厂模式.Order;

import Java设计模式.工厂模式.抽象工厂模式.Pizza.BJCheesePizza;
import Java设计模式.工厂模式.抽象工厂模式.Pizza.BJPepperPizza;
import Java设计模式.工厂模式.抽象工厂模式.Pizza.Pizza;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class BJFactory  implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza= null;

        if (orderType.equals("cheese")){

            pizza= new BJCheesePizza();

        }else if (orderType.equals("pepper"))
        {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
