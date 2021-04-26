package Chatper02Demo01;

/**
 * @author 王艺博
 * @date 2021/4/26 9:27
 */
public class MathDemo {
    public static void main(String[] args) {
        // Math.abs(int a)   返回参数的绝对值
        System.out.println(Math.abs(88));// 88
        System.out.println(Math.abs(-88));//-88
        System.out.println("----------");
        // Math.ceil(double a)返回大于或等于参数最小的double值，等于一个整数
        System.out.println(Math.ceil(9));// 9.0
        System.out.println(Math.ceil(9.1));// 10.0
        System.out.println(Math.ceil(9.9));// 10.0
        System.out.println("----------");
        // Math.floor(double a)返回小于或等于参数最大的double值，等于一个整数
        System.out.println(Math.floor(9));// 9.0
        System.out.println(Math.floor(9.1));// 9.0
        System.out.println(Math.floor(9.9));// 9.0
        System.out.println("----------");
        // Math.round(float a) 按照四舍五入返回最近参数的int类型
        System.out.println(Math.round(4.4F));// 4
        System.out.println(Math.round(4.5F));// 5
        System.out.println("----------");
        // Math.max(int a,int b)返回两个int值中的较大值
        System.out.println(Math.max(4,5)); // 5
        System.out.println("----------");
        // Math.max(int a,int b)返回两个int值中的较小值
        System.out.println(Math.min(4,5)); // 4
        System.out.println("----------");
        // Math.pow(double a,double b)返回a的b次幂的值（a的b次方）
        System.out.println(Math.pow(2,3));
        System.out.println("----------");
        // Math。random()返回[0.0,1.0)随机数
        System.out.println(Math.random());
    }
}
