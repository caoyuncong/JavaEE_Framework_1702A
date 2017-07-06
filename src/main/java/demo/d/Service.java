package demo.d;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mingfei.net@gmail.com
 * 7/6/17 11:37
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class Service {
    public static void main(String[] args) {
        /*
            使用 Spring 方式，输出 “Hello, Tom”
         */

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello) applicationContext.getBean("hello");
        hello.sayHello();
    }
}
