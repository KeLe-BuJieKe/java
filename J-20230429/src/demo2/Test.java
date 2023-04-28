package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 20:16
 */

/**
 * 接口
 * 1.使用关键字 interface 来定义接口
 * 2.接口不能实例化
 * 3.接口当中的成员变量 默认是 public static final
 * 4.接口当中的方法  默认为 public abstract
 * 5.接口当中的方法  不能有具体实现，但是从JDK8开始 可以写一个default修饰的方法
 * 6.接口当中不能有 静态代码块 和 构造方法
 * 7.接口需要被类实现，使用关键字implements
 * 8.接口当中  可以有 static 修饰的方法
 */
interface IShape {
    //int b;  error final修饰的未初始化
    public static final int a = 10;
    public abstract void draw();
    public default void func1(){
        System.out.println("func1");
    }
    public static void func2() {
        System.out.println("func2");
    }
}

class Rect implements IShape {
    @Override
    public void draw(){
        System.out.println("画矩形");
    }
}

class Cycle implements IShape {
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}

public class Test {
    public static void drawMap(IShape shape) {
        shape.draw();
        shape.func1();
        IShape.func2();
    }

    public static void main(String[] args) {
        drawMap(new Rect());
        drawMap(new Cycle());
    }
}
