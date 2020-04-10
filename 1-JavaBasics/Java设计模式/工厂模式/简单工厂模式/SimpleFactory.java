package Java设计模式.工厂模式.简单工厂模式;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
//简单工厂类
public class SimpleFactory {
    //根据orderType返回对应的披萨对象
    public Pizza createPizza(String orderType){

        Pizza pizza= null;

        System.out.println("使用简单工厂模创建披萨");
        if (orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza=new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
           pizza= new PepperPizza();
           pizza.setName("胡椒披萨");
        }

        return pizza;
    }





}
