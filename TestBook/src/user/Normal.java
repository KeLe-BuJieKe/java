package user;

import book.Book;
import book.BookList;
import operator.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 14:25
 */
public class Normal extends User{
    protected Book[] books;
    protected int borrowNum;
    public Normal(String name) {
        super(name);
        this.iOperators = new IOperator[]{
                new Exit(),
                new FindBook(),
                new BorrowBook(),
                new ReturnBook(),
                new ShowUserBorrowBooks()
        };
        books = new Book[10];
        borrowNum = 0;
    }
    public void showBorrowBooks() {
        System.out.println("借阅的书籍如下：");
        for (int i = 0; i < borrowNum; i++) {
            System.out.println("Book{" +
                    "name='" + name + '\'' +
                    ", author='" + books[i].getAuthor() + '\'' +
                    ", price=" + books[i].getPrice() +
                    ", type='" + books[i].getType() + '\'' +
                    ", 借阅数为： " + books[i].getNum() +
                    '}');
        }
    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBook(int pos, Book book) {
        books[pos] = book;
    }

    public int getBorrowNum() {
        return borrowNum;
    }

    public void setBorrowNum(int borrowNum) {
        this.borrowNum = borrowNum;
    }

    @Override
    public int menu() {
        int choice = 0;
        while (true) {
            System.out.println("****************************");
            System.out.println("hello "+ name +" 欢迎进入图书管理系统");
            System.out.println("1.查找图书！");
            System.out.println("2.借阅图书！");
            System.out.println("3.归还图书！");
            System.out.println("4.显示借阅的所有图书！");
            System.out.println("0.退出系统！");
            System.out.println("****************************");
            System.out.println("请输入你的操作：");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            if (choice >= 0 && choice <= 4) {
                break;
            }
            else {
                System.out.println("输入有误，请重新输入!");
            }
        }
        return choice;
    }

}
