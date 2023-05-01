package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-30
 * Time: 17:07
 */
class OuterClass1 {
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;
    //静态内部类
    static class InnerClass {
        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;
        public void func() {
            System.out.println("static->InnerClass::func()");
            OuterClass1 outerClass1 = new OuterClass1();
            /*System.out.println(data1); 在 静态内部类 当中不能 直接 访问 外部类非静态成员
            System.out.println(data2);*/
            System.out.println(outerClass1.data1);
            System.out.println(outerClass1.data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
        }
    }

    public void func() {
        InnerClass innerClass = new InnerClass();
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        //外部类 可以 访问 静态内部类当中的所有成员，尽管是private的也可以
        System.out.println(innerClass.data4);
        System.out.println(innerClass.data5);
        //外部类 可以通过类名去访问 内部类的静态成员
        System.out.println(InnerClass.data6);
    }
}

public class Test1 {
    public static void main(String[] args) {
        OuterClass1.InnerClass innerClass= new OuterClass1.InnerClass();
        innerClass.func();
    }
}
