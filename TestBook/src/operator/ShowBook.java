package operator;

import book.Book;
import book.BookList;
import user.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 14:35
 */
public class ShowBook implements IOperator{
    @Override
    public void work(BookList bookList, User user) {
        System.out.println("打印还拥有的图书！");
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
