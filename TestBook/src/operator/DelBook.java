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
 * Time: 14:34
 */
public class DelBook implements IOperator{
    @Override
    public void work(BookList bookList, User user) {
        System.out.println("删除图书！");
        System.out.println("请输入你要删除的图书的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        int index = -1;
        for (int i = 0; i < currentSize; i++) {
            Book tmp = bookList.getBook(i);
            if(tmp.getName().equals(name)) {
                index = i;
                break;
            }
        }
        //挪动数据
        for (int j = index; j < currentSize-1; j++) {
            //bookList[j] = bookList[j+1];
            Book book = bookList.getBook(j+1);
            bookList.setBook(j, book);
        }
        //修改size
        bookList.setUsedSize(currentSize - 1);
        //因为删除的是对象  所以 把最后一个置为null
        bookList.setBook(currentSize - 1,null);
        System.out.println("删除成功！");
    }
}
