package java列队;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        // 创建两个线程，让其不间断运行
        Thread1 t1 = new Thread1(queue);// 线程1模拟随机添加元素
        Thread2 t2 = new Thread2(queue);// 线程2模拟每隔5秒每次提交10个元素

        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();
    }
}
