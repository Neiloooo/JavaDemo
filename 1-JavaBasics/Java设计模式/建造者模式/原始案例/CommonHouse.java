package Java设计模式.建造者模式.原始案例;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }
}
