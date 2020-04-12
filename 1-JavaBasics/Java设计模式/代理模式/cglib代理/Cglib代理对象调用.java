package Java设计模式.代理模式.cglib代理;

/**
 * @Auther: liushuo
 * @Description: Cglib代理对象的实现
 * @version: 1.0
 */
public class Cglib代理对象调用 {
    public static void main(String[] args) {
        //1.创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //2.获取到代理对象,并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(teacherDao).getProxyInstance();
        //3.执行代理对象的方法,触发intecept 方法,从而实现对目标对象的调用
        proxyInstance.teach();


    }
}
