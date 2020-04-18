package Java设计模式.观察者模式.主动推送;

/**
 * @Auther: liushuo
 * @Description: 核心类:(信息上报类)
 *                      1.包含最新的天气情况信息
 *                      2.含有CurrentCondiotions对象
 *                      3.当数据有更新时,就主动调用 CurrentConditions对象update方法(含有dispaly)
 *                      这样他们(接入方法)就能看到最新的天气信息
 *
 * @version: 1.0
 */

public class WeatherData {

    private float temperatrue;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions; // 聚合

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions=currentConditions;
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

        //调用接口入方的update
        currentConditions.update(getTemperatrue(),getPressure(),getHumidity());
    }

    public void setDate(float temperatrue,float pressure,float humidity){
        this.temperatrue=temperatrue;
        this.pressure=pressure;
        this.humidity=humidity;
        //调用dataChange,将最新的信息推送给接入方currentConditions
        dataChange();
    }
}
