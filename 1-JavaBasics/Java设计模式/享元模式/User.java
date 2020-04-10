package Java设计模式.享元模式;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class User {

    public User(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
