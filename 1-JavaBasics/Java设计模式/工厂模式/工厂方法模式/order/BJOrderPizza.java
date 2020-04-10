package Java设计模式.工厂模式.工厂方法模式.order;

import Java设计模式.工厂模式.工厂方法模式.BJCheesePizza;
import Java设计模式.工厂模式.工厂方法模式.BJPepperPizza;
import Java设计模式.工厂模式.工厂方法模式.Pizza;


/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza= null;
        if (orderType.equals("cheese")){
            pizza= new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;

    }
}
