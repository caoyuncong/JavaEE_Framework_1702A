package demo.service;

import demo.model.User;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/4/17 17:37
 * https://github.com/thu/JavaEE_Framework_1702A/
 * UserService 和 MyBatis / JDBC 是松散耦合
 */
public class UserService {

    private InterfaceTest interfaceTest;

    public void setInterfaceTest(InterfaceTest interfaceTest) {
        this.interfaceTest = interfaceTest;
    }

    public int createUser(User user) {
        return interfaceTest.createUser(user);
    }

    public  int updateUser(User user) {
        return interfaceTest.updateUser(user);
    }

    public  int deleteUser(int id) {
        return interfaceTest.deleteUser(id);
    }

    public  List<User> queryAll() {
        return interfaceTest.queryAll();
    }

    public  User queryById(int id) {
        return interfaceTest.queryById(id);
    }
}
