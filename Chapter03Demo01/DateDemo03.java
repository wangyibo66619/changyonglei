package Chapter03Demo01;

import sun.security.rsa.RSAUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 王艺博
 * @date 2021/4/27 10:07
 */
/*
    构造方法：
        public SimpleDateFormat ()；构造一个SimpleDateFormat，使用默认模式和日期格式
        public SimpleDateFormat (String pattern)：构造一个SimpleDateFormat使用给定的模式和默认的日期格式
    格式化：从Date到String
        public final String format(Date date)：将日期格式化成日期/时间字符串
    解析：从String到Date
        public Date parse(String source),从给定的字符串开始解析文本以生成日期


 */
public class DateDemo03 {
    public static void main(String[] args) throws ParseException {
        //     格式化：从Date到String
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();// 无参构造
        String s = sdf.format(d);
        System.out.println(s);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:ss:mm");
        String s2 = sdf2.format(d);
        System.out.println(s2);
        System.out.println("---------------------------");

        //     解析：从String到Date
        String s3 = "2021年04月27日 10:10:24";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:ss:mm");
        Date d1 =  sdf3.parse(s3);
        System.out.println(d1);

    }
}
