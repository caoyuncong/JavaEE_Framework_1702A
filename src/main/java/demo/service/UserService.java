package demo.service;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import demo.mapper.UserMapper;
import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by mingfei.net@gmail.com
 * 7/4/17 17:37
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class UserService {

    private static int createUserViaXml() { // via 通过\ [ˈvaɪə，ˈviːə]
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.insert("user.create", 1);
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

    private static int createUser() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.create(new User("Jerry2", "123"));
        }
    }

    public static void main(String[] args) {
//        System.out.println(createUserViaXml());
//        System.out.println(createUser());
//        System.out.println(updateUser());
        System.out.println(deleteUser());
    }
}
