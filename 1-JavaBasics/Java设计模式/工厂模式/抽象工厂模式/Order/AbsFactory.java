package Java设计模式.工厂模式.抽象工厂模式.Order;

import Java设计模式.工厂模式.抽象工厂模式.Pizza.Pizza;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
//抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);


}
