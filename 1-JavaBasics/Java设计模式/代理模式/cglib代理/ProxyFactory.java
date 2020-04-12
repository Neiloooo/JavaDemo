package Java设计模式.代理模式.cglib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS;

import java.lang.reflect.Method;

/**
 * @Auther: liushuo
 * @Description:Cglib的代理工厂
 * @version: 1.0
 */
//代理工厂需要实现Cglib提供的接口,进行代理的初始化(不再需要自己自定义接口)
public class ProxyFactory  implements MethodInterceptor {

    //维护一个目标对象
    private Object target;

    //2.通过构造器将被代理的对象传入
    public ProxyFactory(Object target){

        this.target=target;
    }

    //3.返回一个代理对象,是传入的target对象的代理对象
    public Object getProxyInstance(){
        //1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类(将传入的目标对象设置为工具类的父类)
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数(自己)
        enhancer.setCallback(this);
        //4.创建子类对象,即代理对象
        return enhancer.create();
    }

    //重写 intercept方法 会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("Cglib代理模式__开始了");

        //通过反射获取目标对象的方法与传入的参数
        Object returnVal=method.invoke(target,objects);

        System.out.println("Cglib代理模式__结束了");
        return returnVal;
    }
}
