package demo.service;

import demo.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mingfei.net@gmail.com
 * 7/7/17 10:34
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext beans = new ClassPathXmlApplicationContext("test/beans.xml");
        UserService userService = (UserService) beans.getBean("userService");

//        User user = new User("new user", "new password");
//        userService.createUser(user);

        for (User user : userService.queryAll()) {
            System.out.println(user.getUsername());
        }
    }
}
