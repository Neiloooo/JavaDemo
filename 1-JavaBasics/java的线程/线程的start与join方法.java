package java的线程;

import org.junit.Test;

public class 线程的start与join方法 {
    public static int count;
    public static void exec(){
        count+=1;
    }
    @Test
    public void test1() throws Exception{
        for (int i =0;i<1000;i++){
            //返回thread对象
            Thread thread = new Thread(()->{
                exec();
            });
            thread.start();
            //join会强力的让并行变为串行
            thread.join();
            System.out.println(count);
        }
    }

}
 