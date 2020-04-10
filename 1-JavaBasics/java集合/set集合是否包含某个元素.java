package java集合;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class set集合是否包含某个元素 {


    @Test
    public void test1() throws Exception{
        HashSet<String> strHashSet=new HashSet<>();
        strHashSet.add("ROLE_ROOT");
        strHashSet.add("ROLE_ADMIN");


        System.out.println(strHashSet.contains("AAAA"));

    }

}
