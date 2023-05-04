package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-05-04
 * Time: 20:06
 */
public class Test2 {

    public String name = "admin";
    public String password = "123456";

    public  void login1(String name,String password) {
        if(!this.name.equals(name)) {
            System.out.println("用户名错误！");
            return;
        }
        if(!this.password.equals(password)) {
            System.out.println("密码错误！");
            return;
        }
    }

    public void login(String name,String password)
            throws UserNameException,PassWordException {
        if(!this.name.equals(name)) {
            System.out.println("用户名错误！");
            throw new UserNameException("大兄弟 你的用户名错了！");
        }

        if(!this.password.equals(password)) {
            System.out.println("密码错误！");
            throw new PassWordException("大兄弟 你的密码错了！");
        }
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        try {
            test2.login("admin1","12345");
        }catch (UserNameException e) {
            e.printStackTrace();
            System.out.println("用户名异常");
        }catch (PassWordException passWordException) {
            passWordException.printStackTrace();
            System.out.println("密码异常");
        } finally {

        }

       /* int a = 10;
        if(a == 10) {
            throw new ArithmeticException("gaobo");
        }*/

    }
}