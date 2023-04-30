package operator;

import book.Book;
import book.BookList;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 14:35
 */
public class FindBook implements IOperator{
    @Override
    public void work(BookList bookList, User user) {
        System.out.println("查找图书！");
        System.out.println("请输入书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                System.out.println("找到了这本书：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
