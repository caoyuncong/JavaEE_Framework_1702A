package demo.c;

/**
 * Created by mingfei.net@gmail.com
 * 7/6/17 09:09
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class UsbWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        // ...
        System.out.println("write to USB...");
    }
}
