package Java设计模式.工厂模式.抽象工厂模式.Pizza;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
       setName("北京奶酪披萨");
        System.out.println("北京的奶酪披萨");
    }
}
