package demo.c;

/**
 * Created by mingfei.net@gmail.com
 * 7/6/17 09:58
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class Service {
    public static void main(String[] args) {
        Business business = new Business();
        business.setDeviceWriter(new UsbWriter());
        business.write();
    }
}
