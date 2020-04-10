package Java设计模式.享元模式;

import java.util.HashMap;

/**
 * @Auther: liushuo
 * @Description: 享元模式的网站工厂类
 * @version: 1.0
 */
//根据需求返回一个网站
public class WebSiteFactory {

    //集合,充当池的作用
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型,返回一个网站,如果没有就创建一个网站并放入到池中
    public  WebSite getWebSiteCategroy(String type){
        if (!pool.containsKey(type)){
            //就创建一个网站,并放入到池中
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    //获取网站分类的总数(池中有多少个网站类型)
    public int getWebSiteCount(){
        return pool.size();
    }

}
