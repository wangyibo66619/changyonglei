package Chapter03Demo01;

import java.util.Date;

/**
 * @author 王艺博
 * @date 2021/4/27 9:28
 */
/*
    public Date():分配一个Date对象，并初始化，以便它代表它分配的时间，精确到毫秒
    public Date(Long date)：分配一个Date()对象，并将其初始化为表示从标准基准时间起指定的毫秒数
 */
public class DateDemo01 {
    public static void main(String[] args) {
        //     public Date():分配一个Date对象，并初始化，以便它代表它分配的时间，精确到毫秒
        Date d1 = new Date();
        System.out.println(d1);// Tue Apr 27 09:32:59 CST 2021    当前的时间
        //    public Date(Long date)：分配一个Date()对象，并将其初始化为表示从标准基准时间起指定的毫秒数
        long date = 1000*60*60;// 一小时
        Date d2 = new Date(date);
        System.out.println(d2);// Thu Jan 01 09:00:00 CST 1970       1970一月一日01时 00分 00秒
    }
}
