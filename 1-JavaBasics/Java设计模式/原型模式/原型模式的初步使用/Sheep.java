package Java设计模式.原型模式.原型模式的初步使用;

/**
 * @Auther: liushuo
 * @Description:羊实体类
 * @version: 1.0
 */
//实现Cloneable接口
    public class Sheep implements Cloneable{
    //克隆该实例,使用默认的clone的方法来使用
    @Override
    protected Sheep clone()  {
        Sheep sheep=null;
        try {
            //使用默认的clone的方法来克隆
            //使用深拷贝的时候需要自定义clone方法
            sheep=(Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }

    private String name;
    private int age;
    private String color;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Sheep() {
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }


}
