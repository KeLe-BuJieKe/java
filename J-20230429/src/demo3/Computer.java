package demo3;

import java.security.Key;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ZJ
 * Date: 2023-04-28
 * Time: 20:46
 */
public class Computer {
    public void open() {
        System.out.println("开机！");
    }
    public void close() {
        System.out.println("关机！");
    }

    public void useDevice(IUSB usb) {
        usb.connectDevice();
        if (usb instanceof  Mouse) {
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }
        else if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard)usb;
            keyBoard.inPut();
        }
        usb.disconnectDevice();
    }
}
