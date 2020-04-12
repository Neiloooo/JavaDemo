package Java设计模式.代理模式.动态代理;

/**
 * @Auther: liushuo
 * @Description: 目标类
 * @version: 1.0
 */
public class TeacherDao implements ITeacherDao
{


    @Override
    public void teach() {
        System.out.println("目标类中的教师授课中");
    }
}
