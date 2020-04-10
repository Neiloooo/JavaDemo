package Java设计模式.工厂模式.简单工厂模式;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class CheesePizza  extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }
}
