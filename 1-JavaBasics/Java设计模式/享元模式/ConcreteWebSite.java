package Java设计模式.享元模式;

/**
 * @Auther: liushuo
 * @Description: 抽象类的实例
 * @version: 1.0
 */
//具体的网站
public class ConcreteWebSite extends WebSite{

    private String type=""; //网站的发布形式(类型)

    //构造器
    public ConcreteWebSite(String type){
        this.type=type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为"+type+","+user.getName()+"在使用");

    }
}
