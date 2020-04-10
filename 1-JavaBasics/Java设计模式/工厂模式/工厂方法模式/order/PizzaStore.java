package Java设计模式.工厂模式.工厂方法模式.order;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class PizzaStore {
    public static void main(String[] args){
        String loc= "bj";
        if (loc.equals("bj")){
            //创建北京口味的各种Pizza
            new BJOrderPizza();
        }else {
            //创建伦敦口味的各种披萨
            new LDOrderPizza();
        }

    }
}
