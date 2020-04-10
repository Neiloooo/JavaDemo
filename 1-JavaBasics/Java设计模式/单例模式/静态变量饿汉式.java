package Java设计模式.单例模式;

import org.junit.Test;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class 静态变量饿汉式 {

    @Test
    public void Test(){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2==instance1);
    }

}

//饿汉式(静态变量)
class Singleton{

    //1.构造器私有化,外部不能new了
    private Singleton(){

    }

    //2.本类内部创建对象实例
    private final static Singleton instance= new Singleton();


    //3.对外提供一个公有的静态方法,返回实例对象
    public  static  Singleton getInstance(){
        return instance;
    }





}


//饿汉式(静态代码块方式)
class Singleton2{

    //1.构造器私有化,外部不能new了
    private Singleton2(){

    }

    //2.本类内部创建对象实例
    private static Singleton2 instance;
    //2.1在静态代码块中,创建单例对象
    static {
        instance = new Singleton2();
    }

    //3.对外提供一个公有的静态方法,返回实例对象
    public  static  Singleton2 getInstance(){
        return instance;
    }





}

