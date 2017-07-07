package demo.service;

import demo.model.User;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/7/17 09:52
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public interface InterfaceTest {
    int createUser();
    int updateUser();
    int deleteUser();

    List<User> queryAll();
    User queryById();
}
