package Java设计模式.观察者模式.订阅模式;

/**
 * @Auther: liushuo
 * @Description: 订阅接口
 * @version: 1.0
 */
public interface Subject {
    public void registerObserver(Observer o); // 订阅

    public void removeObserver(Observer o); //移除订阅

    public void notifyObserver(); //发放报纸

}
