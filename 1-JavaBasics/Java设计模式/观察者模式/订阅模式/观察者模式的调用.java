package Java设计模式.观察者模式.订阅模式;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class 观察者模式的调用 {
    public static void main(String[] args) {
        //1.创建WeatherData
        WeatherData weatherData = new WeatherData();

        //2.创建观察者
        CurrentCondtions currentCondtions = new CurrentCondtions();

        //3.注册观察者到weatherData(让观察者订阅服务)
        weatherData.registerObserver(currentCondtions);

        //测试
        System.out.println("通知各个已经订阅服务的观察者,看一下信息了");
        weatherData.setDate(10f,20f,32f);


    }
}
