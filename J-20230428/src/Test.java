/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 00:45
 */

class Base {
    public int a;
    public int b;
    public int c = 199;

    public void methodBase() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public int c = 9;

    public void methodDerived() {
        System.out.println("Derived");
    }

    public void methodBase() {
        System.out.println("Derived");
    }

    public void func() {
        super.methodBase(); //强制去调用父类的同名方法
        methodDerived();
    }

    public void func1() {
        //子类有 那么就拿子类的  子类没有就拿父类的
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(super.c);  //如果父类 和 子类 有同名的成员变量，优先访问子类自己的，通过super强制获取到父类的同名变量
                                      //且super不能在static静态方法中使用，作用：在子类方法中调用父类的成员变量和方法
                                      //且
    }

    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.func();
        derived.func1();
    }
}

public class Test {
    public static void main(String[] args) {
        final int A = 10;  //final 修饰一个变量就变为常量与C++ const一致 遵循命名规则 变量名大写
                           //public final String name="123"; 如果final修饰的是成员变量  语法规定  必须同时给定一个值
        //A = 20; error
    }
}
