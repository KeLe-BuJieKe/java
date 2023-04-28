package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 20:44
 */
public class KeyBoard implements IUSB{

    @Override
    public void connectDevice() {
        System.out.println("连接键盘！");
    }

    @Override
    public void disconnectDevice() {
        System.out.println("断开键盘！");
    }

    public void inPut() {
        System.out.println("敲击键盘！");
    }
}
