package demo.service;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import demo.mapper.UserMapper;
import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/4/17 17:37
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class UserService {

    private static int createUserViaXml() { // via 通过\ [ˈvaɪə，ˈviːə]
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.insert("user.create", new User("Tom", "123"));
        }
    }

    private static int updateUser() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.update("user.update", new User(1, "tester", "test"));
        }
    }

    private static int deleteUser() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.delete("user.delete");
        }
    }

    private static List<User> queryAll() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(false)) {
            return sqlSession.selectList("user.queryAll");
        }
    }
/*
    private static int createUser() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.create(new User("Jerry2", "123"));
        }
    }*/

    public static void main(String[] args) {
//        System.out.println(createUserViaXml());
//        System.out.println(createUser());
//        System.out.println(updateUser());
//        System.out.println(deleteUser());

        List<User> users = queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
