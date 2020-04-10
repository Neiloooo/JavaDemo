package Java设计模式.代理模式.静态代理;

/**
 * @Auther: liushuo
 * @Description: 代理对象的调用
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {

        //1.创建目标对象(被代理对象)
        TeacherDao teacherDao = new TeacherDao();

        //2.创建代理对象,同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        //3.通过代理对象,调用被代理对象的增强方法,进而间接执行被代理方法
        teacherDaoProxy.teach();
    }
}
