package Chatper02Demo03;

/**
 * @author 王艺博
 * @date 2021/4/26 20:40
 */
/*
    测试类
    public boolean equals(Object obj)：指一些对象是否等于此
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("王艺博");
        s.setAge(18);

        Student s2 = new Student();
        s2.setName("王艺博");
        s2.setAge(18);
        // 比较两个对象的内容是否相同
        System.out.println(s == s2);// s和s2是地址值，不是对象内容
        System.out.println(s.equals(s2));
        /*
            public boolean equals(Object obj) {
            // this---s   谁调用this就是谁
            // obj---s2
                return (this == obj);// 这里比的还是s和s2的地址
            }
         */

    }
}
