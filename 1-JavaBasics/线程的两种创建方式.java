import org.junit.Test;


public class 线程的两种创建方式 {
    @Test
    public  void  test1(){
        /**
         * first Thread-0 Thread-3
         * second Thread-1 Thread-2
         * 发现线程执行没有顺序
         * 线程默认命名规则: Thread-i
         * 1.线程如何执行(java中不涉及底层)
         *   new 线程对象,参数是Runnable run接口
         *  1.1 Thread t1 = new Thread(Runnable run); 通过实现Runnable接口
         *  1.2 通过继承Thread类复写里面的run方法
         *      Thread t1 = new Thread(){
         *          @Override
         *          public void run(){
         *
         *          }
         *
         *      }
         */
        //1.匿名内部类实现 Runnable接口,再重写里面的run方法里写开启线程的业务
         Thread t1=new Thread(new  Runnable() {
             @Override
             public void run() {
                 //获取当前上下文的执行线程的名字
                 System.out.println(Thread.currentThread().getName());
             }
         });
         //new了t1对象(线程),但是没有开启,通过调用t1.start()进行开启
        t1.setName("实现Runnable接口");
        t1.start();

        //2.通过复写run方法
        Thread t2= new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        t2.setName("继承thread覆写run方法");
        t2.start();
        }
    }
