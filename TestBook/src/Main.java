import book.BookList;
import sun.plugin2.util.SystemUtil;
import user.Admin;
import user.Normal;
import user.User;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 14:47
 */
public class Main {
    public static User login() {
        while (true) {
            System.out.println("请输入你的姓名：");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("请输入你的身份：1->管理员  0->普通用户");
            int choice = scanner.nextInt();
            if (choice == 1) {
                return new Admin(name);
            }
            else if (choice == 0){
                return new Normal(name);
            }
            else {
                System.out.println("输入有误，请重新输入！");
            }
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while (true) {
            int choice = user.menu();
            user.doWork(choice, bookList);
        }
    }
}
