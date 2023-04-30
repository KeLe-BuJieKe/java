package operator;

import book.BookList;
import user.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 14:27
 */
public interface IOperator {
    void work(BookList bookList, User user);
}
