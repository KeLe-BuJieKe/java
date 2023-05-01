package demo1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-30
 * Time: 18:58
 */

interface MyInterface {
    void func();
}

public class Test3 {
    public static void main(String[] args) {
        //匿名内部类
        MyInterface myInterface = new MyInterface() {
            @Override
            public void func() {
                System.out.println("hello 我去");
            }
        };
        myInterface.func();
    }
}
