package Java设计模式.工厂模式.抽象工厂模式.Order;

import Java设计模式.工厂模式.抽象工厂模式.Pizza.*;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
// 这是工厂子类
public class LDFactory  implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza= null;

        if (orderType.equals("cheese")){

            pizza= new LDCheesePizza();

        }else if (orderType.equals("pepper"))
        {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
