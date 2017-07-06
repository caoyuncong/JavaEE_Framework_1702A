package demo.b;

/**
 * Created by mingfei.net@gmail.com
 * 7/6/17 09:08
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class FloppyWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        // ...
        System.out.println("write to floppy...");
    }
}
