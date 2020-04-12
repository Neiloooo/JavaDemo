package Java设计模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: liushuo
 * @Description: 代理类工厂
 * @version: 1.0
 */
public class ProxyFactory {

    //1.维护目标对象 : Object
    private Object target;

    //2.构造器,将目标对象传入
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //3.给目标对象生成一个代理对象
    //通过反射的方式进行生成
    public Object getProxyInstance() {

        //三个参数的解释
        //1. ClassLoader loader : 指定当前目标对象使用的类加载,获取加载器的方法固定
        //2. Class<?>[] interfaces: 目标对象实现的接口类型,使用泛型方法确认类型
        //3. InvocationHandler h : 事情处理,执行目标对象的方法时,会触发事情处理器方法,会把当前执行的目标对象方法作为参数传入
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Jdk代理开始");
                        //反射机制获取目标对象的方法
                        Object invoke = method.invoke(target, args);
                        System.out.println("Jdk代理提交");
                        //有就返回,没有返回null
                        return invoke;
                    }
                }
        );
    }
}
