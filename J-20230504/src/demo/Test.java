package demo;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-05-04
 * Time: 18:30
 */
public class Test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int[] array = {1, 2, 3};
            System.out.println(array[10]);
            System.out.println("after");
        } catch (ArithmeticException e) {
            //test2();//发送邮件的 服务
            e.printStackTrace();
            System.out.println("捕捉到了 ArithmeticException 异常，进行处理异常的逻辑");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("捕获到了 NullPointerException 异常");
        } finally {
            //JDBC  con.close()
            System.out.println("finally一般用于资源的释放.......");
        }
        System.out.println("正常的逻辑........");
    }
}
