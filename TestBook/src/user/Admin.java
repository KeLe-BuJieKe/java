package user;

import operator.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-29
 * Time: 14:24
 */
public class Admin extends User{
    public Admin(String name) {
        super(name);
        this.iOperators = new IOperator[]{
                new Exit(),
                new FindBook(),
                new AddBook(),
                new DelBook(),
                new ShowBook()
        };
    }

    @Override
    public int menu() {
        int choice = 0;
        while (true) {
            System.out.println("****************************");
            System.out.println("hello "+ name +" 欢迎进入图书管理系统");
            System.out.println("1.查找图书！");
            System.out.println("2.新增图书！");
            System.out.println("3.删除图书！");
            System.out.println("4.显示图书！");
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
