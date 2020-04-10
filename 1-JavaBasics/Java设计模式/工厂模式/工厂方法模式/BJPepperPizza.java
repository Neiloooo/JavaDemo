package Java设计模式.工厂模式.工厂方法模式;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class BJPepperPizza extends  Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京的胡椒披萨");
    }
}
