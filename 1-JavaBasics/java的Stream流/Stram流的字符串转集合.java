package java的Stream流;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stram流的字符串转集合 {




    @Test
    private List<String> stringToList (String strArr){
        return Arrays.stream(strArr.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }
}
