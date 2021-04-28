package Chapter03Demo01;

import java.text.ParseException;
import java.util.Date;

/**
 * @author 王艺博
 * @date 2021/4/28 9:25
 */
/*
    测试类
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        // 创建日期对象
        Date d1 = new Date();
        String s1 = DateUtils.dateToString(d1,"yyyy年MM月dd HH:mm:ss");
        System.out.println(s1);
        String s2 = DateUtils.dateToString(d1,"yyyy年MM月dd");
        System.out.println(s2);
        String s3 = DateUtils.dateToString(d1,"HH:mm:ss");
        System.out.println(s3);
        System.out.println("-------------");
        String s = "2021/04/28 10:04";
        Date date = DateUtils.stringToDate(s,"yyyy/MM/dd HH:mm");// 格式必须一致
        System.out.println(date);
    }
}
