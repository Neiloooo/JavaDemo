package java的线程;

import org.junit.Test;

public class newThread是非安全线程 {
    public static int count;
    /**
     * 线程是new Thread中的线程是非安全的
     */
    @Test
    public void test1() throws Exception{
        //执行线程的两种方式:1.集成Thread 2.实现runnable扔到thread类中执行
        //创建线程,每次创建线程count+1
        for (int i =0;i<1000;i++){
         new Thread(()->{
            count+=1;
            //创建,并开启线程
        }).start();
    }
        //通过输出来查看线程对公共资源的抢夺,因为是非安全的,
        // 所以会出现有些线程还没执行完毕,但是主线程已经输出完毕的情况
        System.out.println(count);
    }
}
