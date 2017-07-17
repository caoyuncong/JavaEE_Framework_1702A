package demo.dao.impl;

import demo.dao.UserDao;
import demo.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by mingfei.net@gmail.com
 * 7/11/17 11:56
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void create(User user) {
        sqlSession.insert("user.create", user);
    }

    @Override
    public User query(User user) {
        return sqlSession.selectOne("user.query", user);
    }
}
