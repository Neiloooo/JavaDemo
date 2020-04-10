package Java设计模式.享元模式;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class 享元模式的案例启动 {
    public static void main(String[] args) {

        //创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //根据工厂类创建网站分类
        WebSite webSite = webSiteFactory.getWebSiteCategroy("新闻类型");
        webSite.use(new User("jack"));  //将变化传入

        //根据工厂类创建网站分类
        WebSite webSite1 = webSiteFactory.getWebSiteCategroy("博客形式");
        //将变化传入
        webSite.use(new User("Tom"));


    }
}
