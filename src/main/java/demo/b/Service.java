package demo.b;

/**
 * Created by mingfei.net@gmail.com
 * 7/6/17 09:10
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class Service {
    public static void main(String[] args) {
//        Business business = new Business(new FloppyWriter());
        Business business = new Business(new UsbWriter());
        business.write();
    }
}
