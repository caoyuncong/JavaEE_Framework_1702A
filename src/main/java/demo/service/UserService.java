package demo.service;

import demo.model.User;

/**
 * Created by mingfei.net@gmail.com
 * 7/18/17 10:33
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public interface UserService extends GenericService<User> {

    User signIn(User user);

    boolean signUp(User user);
}
