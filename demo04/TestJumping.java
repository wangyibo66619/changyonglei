package demo04;

/**
 * @author 王艺博
 * @date 2021/4/25 11:27
 */
// 测试类
public class TestJumping {
    public static void main(String[] args) {
        // 需求：创建接口操作类的对象，调用method方法
        JumpingOperator jump = new JumpingOperator();
        Cat cat = new Cat();
        jump.method(cat);
        Dog dog = new Dog();
        jump.method(dog);
        System.out.println("---------");
        // 使用匿名局部类可以不用去写Cat、Dog接口实现类了。直接用匿名局部类实现接口
        jump.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        });
        jump.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("狗也可以跳高了");
            }
        });
        jump.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("猪可以跳高了");
            }
        });
    }
}
