package java加密;

import JAVA18新特性.Employee;
import org.junit.Test;
import sun.security.provider.MD5;

import java.util.Optional;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class md5加密 {

    //秘钥
    String securityKey = "9A0A8659F005D6984697E2CA0A9CF3B7";

    String A= "appId=12345&content=TEST";

    String B = A+"&filename= CARD_APPLY_REQ_350101_20190619120000123.json";

    String signTemp = B+"&key=9A0A8659F005D6984697E2CA0A9CF3B7";






}
