package demo.service.impl;

import demo.dao.GenericDao;
import demo.model.User;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by mingfei.net@gmail.com
 * 7/18/17 10:34
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User> implements UserService {

    @Override
    @Autowired
    @Qualifier("userDaoImpl")
    public void setGenericDao(GenericDao<User> genericDao) {
        super.genericDao = genericDao;
    }
}
