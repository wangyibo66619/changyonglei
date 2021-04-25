package demo01;

/**
 * @author 王艺博
 * @date 2021/4/25 9:54
 */
// 内部类——成员内部类
public class Outer {
    private int age = 10;
    private String name;

     /*public class Inner {
        public void show() {
            System.out.println(age);
            System.out.println(name);
        }
    }*/
     private class Inner {
         public void show() {
             System.out.println(age);
             System.out.println(name);
         }
     }
    // 创建方法来调用Inner内部类的show方法
     public void method() {
         Inner i = new Inner();
         i.show();
     }
}
