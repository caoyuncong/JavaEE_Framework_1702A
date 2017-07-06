package demo.a;

/**
 * Created by mingfei.net@gmail.com
 * 7/6/17 08:56
 * https://github.com/thu/JavaEE_Framework_1702A/
 * 高层应用类
 * 强耦合
 * 松散耦合
 */
public class Business {

    private FloppyWriter floppyWriter;
//    private UsbWriter usbWriter;

//    public Business(UsbWriter usbWriter) {
//        this.usbWriter = usbWriter;
//    }


    public Business(FloppyWriter floppyWriter) {
        this.floppyWriter = floppyWriter;
    }

    public void write() {
        floppyWriter.writeToFloppy();
//        usbWriter.writeToUsb();
    }
}
