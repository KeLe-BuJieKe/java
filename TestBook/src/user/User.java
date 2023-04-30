package user;

import book.Book;
import book.BookList;
import operator.IOperator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 14:23
 */
public abstract class User {
    protected String name;
    protected IOperator[] iOperators;

    public User(String name) {
        this.name = name;

    }
    public abstract int menu();

    public void doWork(int choice, BookList bookList) {
        this.iOperators[choice].work(bookList, this);
    }

    public String getName() {
        return name;
    }
}
