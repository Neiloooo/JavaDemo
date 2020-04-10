package Java设计模式.代理模式.静态代理;

/**
 * @Auther: liushuo
 * @Description:静态代理中的代理对象
 * @version: 1.0
 */
//代理对象,静态代理
public class TeacherDaoProxy implements ITeacherDao {
    //通过接口聚合目标对象

    private ITeacherDao target; //目标对象,通过接口来聚合

    //构造器,实现的接口传入
    public TeacherDaoProxy(ITeacherDao target){
        this.target=target;
    }


    //核心稳定的代码现在其中的子类接口去实现
    //而额外的操作,写在代理对象中实现,这样不仅增强了方法,又使其更加安全
    //(总觉得还是只是提高了复用性与安全性的操作)
    @Override
    public void teach() {
        System.out.println("方法增强开始,可以完成某些操作_____");

        //代理对象传入,调用目标对象的目标方法
        target.teach();

        System.out.println("方法增强结束----_");
    }
}
