package Java设计模式.单例模式;

import org.junit.Test;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class 枚举创建单例模式 {
    @Test
    public void Test() {
        Singleton7 instance = Singleton7.INSTANCE;
        Singleton7 instance1 = Singleton7.INSTANCE;
        System.out.println(instance==instance1);


    }

}

enum Singleton7{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok2");
    }
}