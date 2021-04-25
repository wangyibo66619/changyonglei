package demo02;

/**
 * @author 王艺博
 * @date 2021/4/25 10:14
 */
// 内部类——局部内部类
public class Outer {
    private int age = 18;
    // 局部内部类是方法中定义的类，所以外界无法直接使用，需要在方法内部创建对象并使用
    public void method() {
        class Inner {
            public void show() {
                System.out.println(age);
            }
        }
        // 在这个方法中实例化内部类对象并调用show方法，可以试下删除下面实例化并调用方法代码看下效果
        new Inner().show();
    }

}
