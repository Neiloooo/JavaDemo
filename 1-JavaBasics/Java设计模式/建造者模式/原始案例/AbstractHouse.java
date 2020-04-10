package Java设计模式.建造者模式.原始案例;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWall();
    //封顶
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWall();
        roofed();
    }

}
