package Java设计模式.单例模式;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class 静态内部类完成单例模式 {

    @Test
    public void Test(){
        System.out.println("静态内部类完成单例模式");
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance1 = Singleton6.getInstance();
        System.out.println(instance==instance1);
    }


}


//静态内部类完成单例模式
//类的静态属性只会在第一次加载类的时候初始化
class Singleton6{

    private static Singleton6 instance;
    //构造器私有化
    private Singleton6(){}


    //写一个静态内部类,该类中有一个静态属性Singleton
    private static class  SingletonInstance{
        private static final Singleton6 INSTANCE= new  Singleton6();

    }

    //提供一个静态的公有方法,直接返回成员变量即可
   public static synchronized Singleton6 getInstance(){
       //只有当返回成员变量的时候才会调用静态内部类
       //因为JVM底层在装载类的时候是安全的
        return SingletonInstance.INSTANCE;
    }



}