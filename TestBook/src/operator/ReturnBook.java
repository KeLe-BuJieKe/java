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
 * Time: 14:35
 */
public class ReturnBook implements IOperator{
    @Override
    public void work(BookList bookList, User user) {
        System.out.println("归还图书！");
        System.out.println("输入你要归还的图书：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Normal normal = (Normal)user;
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                int j = 0;
                for ( ; j < normal.getBorrowNum(); ++j) {
                    if (normal.getBook(j).equals(name)) {
                        break;
                    }
                }
                for ( ;j < normal.getBorrowNum() - 1; ++j) {
                    normal.setBook(j, normal.getBook(j + 1));
                }
                book.setNum(book.getNum() + 1);
                normal.setBook(normal.getBorrowNum() - 1, null);
                normal.setBorrowNum(normal.getBorrowNum() - 1);
                System.out.println("归还成功");
                return;
            }
        }
        System.out.println("归还失败");
    }
}
