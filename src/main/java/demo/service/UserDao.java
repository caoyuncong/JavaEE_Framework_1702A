package demo.service;

import demo.model.User;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/7/17 09:52
 * https://github.com/thu/JavaEE_Framework_1702A/
 * DAO - Data Access Object 数据访问对象
 */
public interface UserDao {

    int createUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    List<User> queryAll();

    User queryById(int id);
}
