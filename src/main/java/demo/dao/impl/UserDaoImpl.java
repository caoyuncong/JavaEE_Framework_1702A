package demo.dao.impl;

import demo.dao.UserDao;
import demo.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by mingfei.net@gmail.com
 * 7/11/17 11:56
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {
}
