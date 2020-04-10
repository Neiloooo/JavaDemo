package Java设计模式.建造者模式.建造者模式解决原始案例;

/**
 * @Auther: liushuo
 * @Description: 房屋指挥者
 * @version: 1.0
 */
//指挥者 制定制作流程,并且聚合houseBuilder
public class HouseDirector {
    //聚合,houseBuilder
    HouseBuilder houseBuilder = null;

    //1.构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder= houseBuilder;
    }

    public HouseDirector() {

    }

    //2.或者通过Setter方法传入houseBuilder
    public  void  setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程,交给指挥者(Director)
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.builderHouse();
    }

}
