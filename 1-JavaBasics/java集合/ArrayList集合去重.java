package java集合;

import org.junit.Test;

import java.util.*;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class ArrayList集合去重 {
    @Test
    public void test1() throws Exception {
            String plateNo = "4A00791B";
            Map<String, Long> map = new HashMap<String, Long>();
            Long t1, t2;
            t1 = System.currentTimeMillis();
            t2 = map.get(plateNo);
            //内存中存在
            if (null != t2) {
            //如果时间小于30分钟
            if (t1 - t2 < 1 * 60 * 1000) {
//                continue;
                System.out.println("当前属于1分钟了");
            }
            System.out.println("当前不属于1分钟");
        }
        //不存在放入map
        map.put(plateNo, t1);

            //放入队列
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {

                @Override
                public void run() {
                    //每一小时清空一次map
                    map.clear();
                }
            }, 2000);

        }
    }


