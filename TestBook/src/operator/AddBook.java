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
 * Time: 14:33
 */
public class AddBook implements IOperator{
    @Override
    public void work(BookList bookList, User user) {
        if (bookList.getUsedSize() >= 100) {
            System.out.println("添加失败!");
            return;
        }
        System.out.println("新增图书！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入书名：");
        String name = scanner.nextLine();
        System.out.println("输入作者：");
        String author = scanner.nextLine();
        System.out.println("输入类型：");
        String type = scanner.nextLine();
        System.out.println("输入价格：");
        int price = scanner.nextInt();
        System.out.println("输入数量：");
        int num = scanner.nextInt();
        Book book = new Book(name, author, price, type, num);
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book tmp = bookList.getBook(i);
            if (tmp.getName().equals(name)) {
                tmp.setNum(tmp.getNum() + num);
                System.out.println("添加成功");
                System.out.println(tmp);
                return;
            }
        }
        bookList.setBook(book);
        //修改usedSize
        bookList.setUsedSize(currentSize + 1);
    }
}
