package Java设计模式.单例模式;

import org.junit.Test;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class Synchronized懒汉式 {

    @Test
    public void Test(){
        System.out.println("懒汉式,线程安全");
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();
        System.out.println(instance==instance1);
    }


}


//懒汉式(线程安全,同步方法,sysnchronized锁new方法
//严重影响效率
class Singleton3{

    private static Singleton3 instance;

    private Singleton3(){}

    //提供一个静态的公有的方法,加入同步处理的代码,解决线程安全问题
    //懒汉式 这种锁了new方法,每次只有一个线程能取,效率极低
    public static synchronized Singleton3 getInstance(){
        if (instance == null){
            instance  = new Singleton3();
        }
        return instance;
    }



}

//懒汉式(线程安全,双重检验) 推荐
class Singleton4{

    private static Singleton4 instance;

    private Singleton4(){}

    //提供一个静态的公有方法,加入双重检查代码,
    // 解决线程安全问题,同时解决懒加载问题,而且保证效率,因为不是锁了get方法
    //而是只有当两个线程同时想要new的时候才会锁住锁住类,保证线程安全,
    //其余的都被判null挡在了外面
    public static synchronized Singleton4 getInstance(){

        if (instance == null){
            synchronized (Singleton4.class){
                if (instance==null){
                    instance=new Singleton4();
                }
            }
            instance  = new Singleton4();
        }
        return instance;
    }



}