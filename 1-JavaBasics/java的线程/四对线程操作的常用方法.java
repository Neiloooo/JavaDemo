package java的线程;


import org.junit.Test;

/**
 *1.线程同步想到的都是synchronized加锁那么它们的原理是?
 *2.我们如果synchronized加载静态方法上,那么我们的在字节码中无法看到它锁了,事实上它锁了整个类也就是class
 *3.Thread的常用方法有什么?
 *                              start
 *                      system方法:
 *                              exit(1)
 *                      object方法:
 *                              wait
 *                              notify
 */
class MyRunnable implements Runnable{
    public int count;
    public boolean flag=true;
    //这里锁的是this,也就是当前对象,static锁的是class
    public synchronized void exec() throws Exception{
        count+=1;
        //当flag等于true,就会进入该判断,置标志位为false,然后调用wait方法让其进入挂起状态
        if (flag){
            flag=false;
            wait(1);
            System.out.println("wait后还会执行吗?");
        }else {
            //激活被挂起的线程
            notify();
        }
        System.out.println(Thread.currentThread().getId());
    }
    @Override
    public void run() {
        try {
            exec();
            //3.三种线程退出方式:
            //1.System.exit(1);显示调用exit退出,(1,0正常/-1异常)
            //2.return
            //3.抛出异常的方式, throw exception
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class 四对线程操作的常用方法 extends MyRunnable {
    @Test
    public void test1() throws Exception{
        MyRunnable myRunnable = new MyRunnable();
        //执行两个线程的两种方式:
                //1.继承Thread
                //2.实现runnable接口扔到new的Thread类中
        new Thread(myRunnable).start();
        new Thread(myRunnable).start();

        //两个线程锁的是不同的对象,所以都是wait()到线程结束,开启的是独立的线程
        //两个线程执行顺序:
                    //1.第一个线程执行后被被挂起
                    //2.第二个线程执行的时候唤醒了第一个被挂起的线程
    }

}


