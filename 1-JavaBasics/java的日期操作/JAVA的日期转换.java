package java的日期操作;

import org.junit.Test;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class JAVA的日期转换 {

    @Test
    public void test1() throws Exception{
        String s="2018-02-07 00:00:00";
        String newStrSecond=s.replaceAll("-","");
        System.out.println(s.replaceAll("-","").substring(0,8));

    }

}
