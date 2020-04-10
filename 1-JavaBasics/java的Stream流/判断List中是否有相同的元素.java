package java的Stream流;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class 判断List中是否有相同的元素 {

    @Test
    public void test1() throws Exception{

        List<Integer> list = new ArrayList() {
            {
                add(1);
                add(2);
            }
        };
        //获取不重复的集合元素个数
        long count = list.stream().distinct().count();
        boolean isRepeat = count < list.size();
        System.out.println(count);//输出2
        System.out.println(isRepeat);//输出true

    }


}
