package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 17:05
 */

abstract class Shape {
    public abstract void draw();
    public void func(){}
}

class Rect extends Shape {
    @Override
    public void draw(){
        System.out.println("画矩形");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}

public class Test {
    public static void drawMap(Shape shape) {
        shape.draw();
        shape.func();
    }

    public static void main(String[] args) {
        /**
         * 抽象类 与 普通类区别
         * 1.抽象类 使用abstract 修饰类   与C++不同：C++关键字是virtual，且是有纯虚函数的类就是抽象类
         * 2.抽象类不能实例化   这点与C++一致
         * 3.此时在抽象类当中 可以有抽象方法 也可以有 非抽象方法  具体看 12 和 13 行
         * 4.什么是抽象方法 即一个方法被abstract修饰，没有具体的实现。只要包含抽象方法，这个类必须是抽象类
         * 5.当派生类继承了抽象类，必须重写抽象方法，如果子类不重写，那么子类也是抽象类   这点与C++一致
         * 6.抽象方法不能被final private static修饰
         */
        //Shape shape = new Shape();  error
        drawMap(new Rect());
        drawMap(new Cycle());
    }
}
