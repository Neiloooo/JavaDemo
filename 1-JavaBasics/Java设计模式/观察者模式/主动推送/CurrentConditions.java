package Java设计模式.观察者模式.主动推送;

/**
 * @Auther: liushuo
 * @Description: 显示当前天气情况,气象站自己的网站
 * @version: 1.0
 */
//数据推送到这里进行实时展示
public class CurrentConditions {

    //温度,气压,温度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新 天气情况,是由WeatherData 来调用,使用的推送模式
    public void update(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        dispaly();
    }

    //显示
    public void dispaly(){
        System.out.println("今天 temperature:"+temperature);
        System.out.println("今天 pressure: "+pressure);
        System.out.println("今天 humidity: "+humidity);
    }
}
