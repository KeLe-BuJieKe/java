package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 20:31
 */
public class Mouse implements IUSB{

    @Override
    public void connectDevice() {
        System.out.println("连接鼠标！");
    }

    @Override
    public void disconnectDevice() {
        System.out.println("断开鼠标！");
    }

    public void click() {
        System.out.println("点击鼠标！");
    }
}
