package demo4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 22:23
 */
interface A{
    void funcA();
}

interface B{
    void funcB();
}

//接口的继承
interface  C extends A, B{
    void funcC();
}

public class Test2 {
}
