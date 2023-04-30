package operator;

import book.Book;
import book.BookList;
import user.Normal;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 14:34
 */
public class BorrowBook implements IOperator{
    @Override
    public void work(BookList bookList, User user) {
        System.out.println("借阅图书！");
        System.out.println("输入你要借阅的图书名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Normal normal = (Normal)user;
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name) && book.getNum() > 0 &&
                    normal.getBorrowNum() >= 0 && normal.getBorrowNum() <= 9) {

                normal.setBook(normal.getBorrowNum(), book.bookClone());
                book.setNum(book.getNum() - 1);
                normal.setBorrowNum(normal.getBorrowNum() + 1);
                System.out.println("借阅成功");
                return;
            }
        }
        System.out.println("借阅失败");
    }
}
