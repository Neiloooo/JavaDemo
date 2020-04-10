package java的线程;

import org.junit.Test;
/**
 * 主线程与从线程的控制与使用:
 * 1.synchronized (this)锁住的是当前对象,
 * 2.正常来讲,开启一个从线程不会影响主线程的继续执行
 * 3.Main线程具有抢占cpu资源，然后执行完后，在开始执行子线程。
 */
public class 五Thread类中主线程与从线程的执行关系 {

//    @Test
    public void test1() throws Exception{
        MyThread myThread = new MyThread();
        System.out.println("执行多线程操作前");
        myThread.start();
        System.out.println("执行多线程中");
        MyThread myThread1 = new MyThread();
        myThread1.start();
        System.out. println("执行多线程操作后");
    }
    public static class MyThread extends Thread{
        @Override
        public void run(){
            //锁对象
//            synchronized (this){
                for (int i = 0; i <3 ; i++) {
                    System.out.println("number:"+i);
//                }
            }
        }
    }
    /**
     * 1.当我们想让主线程挂起等待从线程的时候,需要使用wait,
     */
    @Test
    public void test2() throws Exception{
        MyThread2 myThread = new MyThread2();
        System.out.println("第二次执行多线程操作前");
//        myThread.start();
        synchronized (myThread){
            System.out.println("你妈的我被锁住了");
            Thread.sleep(8000);
        }
        System.out.println("第二次执行多线程中");
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        synchronized (myThread){
            //wait方法会将当前线程(主线程)放入wait set，等待被唤醒，并放弃lock对象上的所有同步声明
            //这样会优先让主线程把锁让给从线程,也就是串行了
            //主线程被挂起,锁让给了从线程2号
            myThread2.wait();
            System.out.println(1);
            myThread.start();
        }
        System.out. println("第二次执行多线程操作后");
    }
    public static class MyThread2 extends Thread{
        @Override
        public void run(){
            //锁对象
           synchronized (this){
            for (int i = 0; i <50 ; i++) {
                System.out.println("number:"+i);
                }
            }
        }
    }
}
