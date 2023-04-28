package demo3;

import javax.smartcardio.CommandAPDU;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 20:49
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();
        Mouse mouse = new Mouse();
        KeyBoard keyBoard = new KeyBoard();
        computer.useDevice(mouse);
        System.out.println("--------------------");
        computer.useDevice(keyBoard);
        computer.close();
    }
}
