package Java设计模式.工厂模式.简单工厂模式;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class OrderPizza {


    //定义一个简单工厂对象
    SimpleFactory simpleFactory;

    Pizza pizza= null;

    //构造器,new的调用的方法,我们重写后会执行我们当前的方法
    public OrderPizza(SimpleFactory SimpleFactory){
        //new的时候构造简单的工厂
        setSimpleFactory(SimpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType="";//用户输入的订什么样的披萨

        this.simpleFactory=simpleFactory; //设置简单工厂对象

        do{
            orderType=getType();
            //根据类型创建披萨对象
            Pizza pizza = this.simpleFactory.createPizza(orderType);
            //输出Pizza
            if (pizza!=null){ // 订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购披萨失败");
                break;
            }

        }while (true);
    }

    private String getType() {
        return "A";
    }

    //

}
