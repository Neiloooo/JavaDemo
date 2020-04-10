package Java设计模式.原型模式.深拷贝;

import java.io.*;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class DeepProtoType implements Serializable,Cloneable {

    public String name;
    public DeepCloneableTaraget deepCloneableTaraget; // 引用类型的熟悉女

    public DeepProtoType() {
        super();
    }

    //深拷贝 - 方式1使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //1.这里完成对基本数据类型(属性)和字符串的克隆
        deep= super.clone();
        //2.单独处理引用类型属性
        //2.1强转已经处理完基本数据类型的deep
        DeepProtoType deepProtoType= (DeepProtoType)deep;
        //2.2调用clone方法后,强转成引用类型的类型赋值给引用类型-->将引用强转成对象赋值给引用类型
        deepProtoType.deepCloneableTaraget=(DeepCloneableTaraget)deepProtoType.clone();
        return deep;
    }

    //深拷贝 - 方式2通过对象的序列化实现*(推荐)
    //对象方式序列化,再对象方式读回来(反序列化)
    public Object deeepClone(){
        //1.创建字节流数组输出流对象和输入流
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos= null; //对象输出流
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化操作
            bos=new ByteArrayOutputStream();
            oos= new ObjectOutputStream(bos);
            oos.writeObject(this); // 当前这个对象以对象流的方式输出

            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
