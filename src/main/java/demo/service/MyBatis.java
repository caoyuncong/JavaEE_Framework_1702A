package demo.service;

import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/7/17 10:22
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class MyBatis implements InterfaceTest {

    @Override
    public int createUser(User user) {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.insert("user.create", user);
        }
    }

    @Override
    public int updateUser(User user) {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.update("user.update", user);
        }
    }

    @Override
    public int deleteUser(int id) {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.delete("user.delete", id);
        }
    }

    @Override
    public List<User> queryAll() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(false)) {
            return sqlSession.selectList("user.queryAll");
        }
    }

    @Override
    public User queryById(int id) {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(false)) {
            return sqlSession.selectOne("user.queryById", id);
        }
    }

}
