package demo.c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mingfei.net@gmail.com
 * 7/6/17 09:58
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class Service {
    public static void main(String[] args) {
//        Business business = new Business();
//        business.setDeviceWriter(new UsbWriter());
//        business.write();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Business business = (Business) applicationContext.getBean("business");
        business.write();
    }
}
