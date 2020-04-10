package Java设计模式.代理模式.静态代理;

/**
 * @Auther: liushuo
 * @Description:静态代理中的目标对象
 * @version: 1.0
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中----");
    }
}
