package Chatper02Demo02;

/**
 * @author 王艺博
 * @date 2021/4/26 19:34
 */
/*
    Object是类层次的根，每个类都可以将Object类当做超类，所有类都直接或间接继承该类
    看方法的源码选中方法，按ctrl + b
    建议所有子类重写toString()方法
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("王艺博");
        s.setAge(18);
        System.out.println(s);// demo02.Student@1b6d3586
        System.out.println(s.toString());// demo02.Student@1b6d3586

        /*
            public void println(Object x) { // x = s
                String s = String.valueOf(x);
                synchronized (this) {
                print(s);
                newLine();
            }
        }

        public static String valueOf(Object obj) { //obj = x
            return (obj == null) ? "null" : obj.toString();
        }

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */
    }
}
