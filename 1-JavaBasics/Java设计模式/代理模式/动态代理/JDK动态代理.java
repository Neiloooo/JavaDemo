package Java设计模式.代理模式.动态代理;

/**
 * @Auther: liushuo
 * @Description: 调用类
 * @version: 1.0
 */
public class JDK动态代理 {

    public static void main(String[] args) {

        //1.创建目标对象,强转为其实现的接口
        ITeacherDao target = new TeacherDao();

        //2.给目标对象,创建代理对象,将其转成目标对象所实现的接口
        ITeacherDao proxyInstance =(ITeacherDao) new ProxyFactory(target).getProxyInstance();

        //proxyInstance = class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println("proxyInstance = " +proxyInstance.getClass());

        //3.通过代理对象,调用目标对象的teach方法
        proxyInstance.teach();

    }



}
