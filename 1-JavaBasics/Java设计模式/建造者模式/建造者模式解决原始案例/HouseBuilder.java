package Java设计模式.建造者模式.建造者模式解决原始案例;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
//抽象的建造者
public abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好,抽象的方法
    public abstract  void  buildBasic();
    public abstract  void  buildWalls();
    public abstract  void  roofed();

    //使用前面的流程建造房子(返回房子),可以自由规定使用哪几个流程建造
    public House builderHouse(){
        return house;
    }
}
