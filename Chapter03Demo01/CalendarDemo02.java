package Chapter03Demo01;

import java.util.Calendar;

/**
 * @author 王艺博
 * @date 2021/4/28 10:51
 */
/*
    public abstract void add (int field,int amount):根据日历的规则，将指定的时间量添加或减去给定的日历字段
    public final void set(int year,int month,int date):设置当前日历的年月日
 */
public class CalendarDemo02 {
    public static void main(String[] args) {
        // 获取日历对象
        Calendar c = Calendar.getInstance();
        // public int get(int field)   返回给定日历字段的值
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
//    public abstract void add (int field,int amount):根据日历的规则，将指定的时间量添加或减去给定的日历字段
        // 需求：三年前的今天
        c.add(Calendar.YEAR,-3);
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH);
        int date1 = c.get(Calendar.DATE);
        System.out.println(year1 + "年" + month1 + "月" + date1 + "日");
        // 需求：十年后的五天前
        c.add(Calendar.YEAR,-3);
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH);
        int date2 = c.get(Calendar.DATE);
        System.out.println(year1 + "年" + month2 + "月" + date2 + "日");

        //    public final void set(int year,int month,int date):设置当前日历的年月日
        c.set(2031,4,28);
        int year3 = c.get(Calendar.YEAR);
        int month3 = c.get(Calendar.MONTH);
        int date3 = c.get(Calendar.DATE);
        System.out.println(year3 + "年" + month3 + "月" + date3 + "日");
    }
}
