package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-30
 * Time: 17:39
 */
class OuterClass2 {
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;
    //非静态内部类
    class InnerClass2 {
        public int data1 = 1111;
        public int data4 = 4;
        private int data5 = 5;
        //public static int data6 = 6; 在实例内部类当中 不能定义静态的成员变量
        //如果就是要定义成静态的，那么可以加上final关键字
        //这样这个data6就是常量，在编译的时候就能确定它的值
        public static final int data6 = 6;
        public void func() {
            //内部类data1
            System.out.println(data1);
            System.out.println(this.data1);
            //外部类data1  在 非静态内部类 当中 它包含两个this，一个外部类this 一个内部类自己的this
            //当要访问同名的外部类成员时要 类名.this.成员
            System.out.println(OuterClass2.this.data1);

            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
        }
    }

    public void func() {
        InnerClass2 innerClass2 = new InnerClass2();
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        //外部类 可以 访问 静态内部类当中的所有成员，尽管是private的也可以
        System.out.println(innerClass2.data4);
        System.out.println(innerClass2.data5);
        //外部类 可以通过类名去访问 内部类的静态成员
        System.out.println(InnerClass2.data6);
    }
}

public class Test2 {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        //非静态内部类 实例内部类比较麻烦 需要通过外部类对象
        OuterClass2.InnerClass2 innerClass2 = outerClass2.new InnerClass2();
        innerClass2.func();
    }
}
