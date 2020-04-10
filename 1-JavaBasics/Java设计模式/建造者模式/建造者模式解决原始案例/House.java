package Java设计模式.建造者模式.建造者模式解决原始案例;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
//产品- > 对应product
public class House {

    private String baise;
    private String wall;
    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }


}
