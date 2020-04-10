package Java设计模式.原型模式.原型模式的初步使用;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class 浅拷贝的方式实现创建十只羊 {
    public static void main(String[] args){
        System.out.println("原型模式完成对象的创建");
        //调用object的默认克隆方法进行克隆
        //优点: 只需要改实现Cloneable实体一处的实体即可
        //      大幅度提高代码复用性
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 =  sheep.clone();
        Sheep sheep4 = sheep.clone();
        Sheep sheep5 = sheep.clone();
        Sheep sheep6 = sheep.clone();
        System.out.println("sheep="+sheep);
        System.out.println("sheep2="+sheep2);
        System.out.println("sheep3="+sheep3);
        System.out.println("sheep4="+sheep4);
        System.out.println("sheep5="+sheep5);
        System.out.println("sheep6="+sheep6);

    }
}
