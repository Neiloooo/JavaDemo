package Java设计模式.建造者模式.原始案例;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args){
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
