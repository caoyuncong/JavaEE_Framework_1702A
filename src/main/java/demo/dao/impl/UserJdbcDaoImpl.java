package demo.dao.impl;

import demo.dao.UserDao;
import demo.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by mingfei.net@gmail.com
 * 7/18/17 14:11
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
@Repository
public class UserJdbcDaoImpl extends JdbcDaoImpl<User> implements UserDao {
}

/*
    Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException:
    No qualifying bean of type 'demo.dao.UserDao' available:
    expected single matching bean but found 2: userDaoImpl,userJdbcDaoImpl

    qualify 有资格\ ['kwɒlɪfaɪ]
    qualifier 限定符\ ['kwɒlɪfaɪə\(r\)]
 */
