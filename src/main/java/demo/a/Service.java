package demo.a;

/**
 * Created by mingfei.net@gmail.com
 * 7/6/17 08:56
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class Service {

    public static void main(String[] args) {
        Business business = new Business(new FloppyWriter());
        business.write();
    }
}
