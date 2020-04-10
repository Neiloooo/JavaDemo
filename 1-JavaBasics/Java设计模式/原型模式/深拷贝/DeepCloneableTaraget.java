package Java设计模式.原型模式.深拷贝;

import java.io.Serializable;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class DeepCloneableTaraget implements Serializable,Cloneable {
    private static final long serialVsersionUID=1L;

    private String cloneName;


    private String cloneClass;

    public DeepCloneableTaraget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性都是数值类型,所以默认使用浅拷贝即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
