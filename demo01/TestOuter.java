package demo01;

/**
 * @author 王艺博
 * @date 2021/4/25 9:56
 */
public class TestOuter {
    public static void main(String[] args) {
        //Outer.Inner inner = new Outer().new Inner();
        //inner.show();

        Outer outer = new Outer();
        outer.method();
    }
}
