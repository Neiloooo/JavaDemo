package java的字符串匹配;

import org.junit.Test;
import java.util.regex.*;

public class Java的字符串匹配方法 {

    @Test
    public void test1() throws Exception{
        String content ="A5316EC3SpNum,A5316EC3";
        String pattern = ".*SpNum.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println( isMatch);
    }
}
