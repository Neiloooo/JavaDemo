package Java设计模式.建造者模式.建造者模式解决原始案例;

/**
 * @Auther: liushuo
 * @Description: 实例化的建造者
 * @version: 1.0
 */

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼的地基100迷");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙20迷");
    }

    @Override
    public void roofed() {
        System.out.println("高楼盖透明的屋顶");
    }
}
