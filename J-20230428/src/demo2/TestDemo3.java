package demo2;

import demo1.TestDemo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 1:59
 */
public class TestDemo3 extends TestDemo1 {
    public void func() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        TestDemo3 testDemo = new TestDemo3();
        //System.out.println(testDemo1.a);
        testDemo.func();
    }
}
