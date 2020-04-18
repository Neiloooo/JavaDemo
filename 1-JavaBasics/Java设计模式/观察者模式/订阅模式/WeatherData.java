package Java设计模式.观察者模式.订阅模式;

import Java设计模式.观察者模式.主动推送.CurrentConditions;

import java.util.ArrayList;

/**
 * @Auther: liushuo
 * @Description: 1.包含最新的天气情况信息
 *                2.含有 观察者集合, 使用ArrayList管理
 *                3.当数据有更新时,就主动的调用ArrayList,通知所有的(接入方)就看到最新的信息
 * @version: 1.0
 */
public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;

    //观察者集合
    private ArrayList<Observer> observers;

    //构造方法
    public WeatherData() {
        observers  = new ArrayList<Observer>();
    }

    public float getTemperatrue() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange(){
        //调用通知所有观察者获取数据的方法
        notifyObserver();
    }

    public void setDate(float temperatrue,float pressure,float humidity){
        this.temperatrue=temperatrue;
        this.pressure=pressure;
        this.humidity=humidity;
        //当传入数据的时候调用数据变化的方法
        dataChange();
    }


    //注册订阅者
    @Override
    public void registerObserver(Observer o) {
            observers.add(o);
    }

    //移除订阅者
    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)){
            observers.remove(o);
        }
    }

    //遍历所有的观察者,并通知
    @Override
    public void notifyObserver() {

        for (int i = 0 ; i<observers.size();i++){
            observers.get(i).update(this.temperatrue,this.pressure,this.humidity);
        }

    }
}
