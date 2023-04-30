package operator;

import book.BookList;
import user.Normal;
import user.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 22:28
 */
public class ShowUserBorrowBooks implements IOperator{
    @Override
    public void work(BookList bookList, User user) {
        System.out.println("下面是 " + user.getName() + " 借阅的所有书籍");
        if (user instanceof Normal) {
            Normal normal = (Normal)user;
            normal.showBorrowBooks();
        }
    }
}
