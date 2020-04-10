package Java设计模式.建造者模式.建造者模式解决原始案例;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
//调用客户端
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //完成盖的房子,返回产品(普通房子)
        House house = houseDirector.constructHouse();

        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //重置一个建造者
        houseDirector.setHouseBuilder(highBuilding);
        //完成盖房子,返回产品(高楼)
        houseDirector.constructHouse();
    }
}
