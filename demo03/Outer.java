package demo03;

/**
 * @author 王艺博
 * @date 2021/4/25 10:32
 */

/*
    前提：
        存在一个类或者接口
        这里的类可以是具体类也可以是抽象类
    格式：
        new 类名或者接口名 {
           重写方法;
        };
    本质是什么呢？
        是一个继承了该类或者实现了该接口的子匿名对象
 */
// 内部类——匿名内部类
public class Outer {
    // 匿名内部类是局部内部类的一种特殊形式,所以也要在方法里面写
    public void method() {
        /*
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        */
    //    show();
        /*   // 调用两次
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();
        */
        // 多次调用
        Inter inter = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        inter.show();
        inter.show();
    }
}
