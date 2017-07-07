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

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int createUser(User user) {
        return userDao.createUser(user);
    }

    public  int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public  int deleteUser(int id) {
        return userDao.deleteUser(id);
    }

    public  List<User> queryAll() {
        return userDao.queryAll();
    }

    public  User queryById(int id) {
        return userDao.queryById(id);
    }
}
