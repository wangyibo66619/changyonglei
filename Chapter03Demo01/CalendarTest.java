package Chapter03Demo01;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/4/28 11:26
 */
/*
    需求：
        获取一年的二月天有多少天
    思路：
        1.键盘录入任意的年份
        2.设置日历的年、月、日
            年：来自键盘输入
            月：设置为3月，月份是从零开始的，所以设置的值为2
            日：设置为一日
        3. 3月1日往前推一天，就是二月的最后一天
        4. 获取这一天输出即可
 */
public class CalendarTest {
    public static void main(String[] args) {
        // 键盘录入任意的年份
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        // 设置年、月、日
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);// 月是从零开始数的
        // 三月一日往前推一天，就是2月的最后一天
        c.add(Calendar.DATE, -1);
        // 获取这一天输出即可
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年的二月份有" + date + "天");
    }
}
