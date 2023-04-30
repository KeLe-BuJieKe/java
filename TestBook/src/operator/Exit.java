package operator;

import book.BookList;
import user.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 14:34
 */
public class Exit implements IOperator{
    @Override
    public void work(BookList bookList, User user) {
        System.out.println("成功退出系统");
        System.exit(0);
    }
}
