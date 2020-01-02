package java的线程;

import org.junit.Test;

public class  阻塞锁synchronized让Thread安全每次执行结果一致 {
    public static int count;
    public static synchronized void exec(){
        //阻塞锁方法里面的内容是被限制的,
        //锁住后,执行该方法的线程都会排队,且主线程是不会等待附属线程
        //锁哪哪串行
        count+=1;
    }
    @Test
    public void test1() throws Exception{
        for (int i =0;i<1000;i++){
            //多线程是先开线程,再执行线程中的内容,开了线程后各做各的
            new Thread(()->{
                exec();
            }).start();
        }
        //所以需要让主线睡眠,等等未执行完毕的附属线程,这样的结果才是我们想要的记过
        Thread.sleep(1000);
        System.out.println(count);
    }
}
