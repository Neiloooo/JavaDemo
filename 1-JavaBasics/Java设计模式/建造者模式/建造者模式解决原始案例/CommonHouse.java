package Java设计模式.建造者模式.建造者模式解决原始案例;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
//制造的流程和产品本身解耦了
public class CommonHouse  extends  HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("盖普通房子的屋顶");
    }

}
