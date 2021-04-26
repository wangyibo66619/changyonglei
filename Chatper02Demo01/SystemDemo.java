package Chatper02Demo01;

/**
 * @author 王艺博
 * @date 2021/4/26 14:14
 */
public class SystemDemo {
    public static void main(String[] args) {
        // public static void exit(int status);终止当前运行的java虚拟机，非零表示异常终止
        /*
        System.out.println("开始");
        System.exit(0);
        System.out.println("结束");
        */
        // public static long currentTimeMillis();返回当前距1979年1月1日时间（以毫秒为单位）
        System.out.println(System.currentTimeMillis());
        // 计算当前距1979年1月1日时间（以天为单位）
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end -start) + "毫秒");
    }
}
