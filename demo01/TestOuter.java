package demo01;

/**
 * @author ηθΊε
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
