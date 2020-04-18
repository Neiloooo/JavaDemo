package Java设计模式.观察者模式.订阅模式;

/**
 * @Auther: liushuo
 * @Description:观察者接口
 * @version: 1.0
 */
public interface Observer {

    public void update(float temperature,float pressure, float humidity);

}
