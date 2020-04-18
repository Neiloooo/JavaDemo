package Java设计模式.观察者模式.主动推送;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class 主动推送模式 {
    public static void main(String[] args) {
        //创建接入方currentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        //创建WeatherData 并将 接入方 currentConditions 传递到WeatherData中
        WeatherData weatherData = new WeatherData(currentConditions);

        //主动推送数据,必须主动传入参数,才会更改数据
        weatherData.setDate(30,10,20);

    }
}
