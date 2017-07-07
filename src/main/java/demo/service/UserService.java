package demo.service;

import demo.model.User;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/4/17 17:37
 * https://github.com/thu/JavaEE_Framework_1702A/
 * UserService 和 MyBatis 是强耦合
 */
public class UserService {

    private InterfaceTest interfaceTest;

    private int createUser() { // via 通过\ [ˈvaɪə，ˈviːə]
        return interfaceTest.createUser();
    }

    private  int updateUser() {
        return interfaceTest.updateUser();
    }

    private  int deleteUser() {
        return interfaceTest.deleteUser();
    }

    private  List<User> queryAll() {
        return interfaceTest.queryAll();
    }

    private  User queryById() {
        return interfaceTest.queryById();
    }

    public  void main(String[] args) {
//        System.out.println(createUser());
//        System.out.println(updateUser());
//        System.out.println(deleteUser());
//        List<User> users = queryAll();
//        for (User user : users) {
//            System.out.println(user);
//        }
//        System.out.println(queryById());
    }
}
