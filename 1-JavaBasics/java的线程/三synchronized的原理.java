package java的线程;
/**
 * 线程同步,都是synchronized加锁,他的原理是什么?
 * 如果synchronized加载静态方法上,那么我们在字节码中无法看到它锁了,因为它锁了整个类,也就是class
 */
public class 三synchronized的原理 {
    public static int count;
    public static synchronized void exec(){
        count+=1;
    }

    public void test1() throws  Exception{
        for (int i =0;i<1000;i++){
            //new 一个线程,里面的参数为myRun对象
            Thread thread = new Thread(new myRun());
            thread.start();
        }
    }
    //自定义静态类,实现Runnable接口,重写里面的run方法
    static class  myRun implements Runnable{
        @Override
        public void run() {
            exec();
        }
    }
}


