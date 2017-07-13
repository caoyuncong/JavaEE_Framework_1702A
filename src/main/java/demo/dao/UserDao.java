package demo.dao;

import demo.model.User;

/**
 * Created by mingfei.net@gmail.com
 * 7/11/17 11:55
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public interface UserDao {

    void create(User user);

    User signIn(User user);
}
