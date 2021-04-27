package Chapter03Demo01;

import java.util.Date;

/**
 * @author 王艺博
 * @date 2021/4/27 9:42
 */
/*
    public long getTime():获取的是日期对象从1970年一月一日 00::00:00 到现在的毫秒值
    public void setTime(Long time):设置时间，给的是毫秒值
 */
public class DateDemo02 {
    public static void main(String[] args) {
        // 创建日期对象
        Date d1 = new Date();
        //     public long getTime():获取的是日期对象从1970年一月一日 00::00:00 到现在的毫秒值
        System.out.println(d1.getTime());// 1619488048355
        System.out.println((int) (d1.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365) + "年");

        //    public void setTime(Long time):设置时间，给的是毫秒值
        //long time = 1000*60*60;
        long time = System.currentTimeMillis();
        d1.setTime(time);
        System.out.println(d1);// Tue Apr 27 09:57:26 CST 2021
    }
}
