package java的截取字符串;
import org.junit.Test;

public class 一截取字符串 {
    String a="http://localhost:5432/etcpos/fetchOBUInfo.do?rsuIp=192.168.0.54&fetchStationInfo=false&timeout=5000";
    String b= "0012";
    String c= "0011";
    String d= "0001";
    String e= "ABCS";
    @Test
    public void test1() throws Exception{
            String E=d;
            if (E.substring(2,3).equals("0")){
                System.out.println(E.substring(3,4));
            }else if (E.substring(2,3).equals("1")){
                System.out.println(E.substring(2,4));
            }else {
                System.out.println("乱码");
            }
            System.out.println();
        }
}
