package java的定时器;

import java.text.ParseException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class 每隔制定时间定时运行函数 {

    public static void main(String[] args) throws ParseException {
//        String sdate = "2018-02-10";
//        SimpleDateFormat sf = new SimpleDateFormat("yy-MM-dd");
//        Date date = sf.parse(sdate);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("系统正在运行……");
            }
        }, 2000);
        /*如果指定的date时间是当天或者今天之前，启动定时器后会立即每隔2s运行一次定时器任务*/
        /*如果指定的date时间是未来的某天，启动定时器后会在未来的那天开始，每隔2s执行一次定时器任务*/
    }
}
