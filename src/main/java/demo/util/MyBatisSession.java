package demo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * Created by mingfei.net@gmail.com
 * 7/4/17 17:29
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class MyBatisSession { // singleton class 单例模式 单一的一个实例

    private static SqlSessionFactory sqlSessionFactory;

    private static SqlSessionFactory getSqlSessionFactory() {
        if (sqlSessionFactory == null) {
            try {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession(boolean autoCommit) {
        return getSqlSessionFactory().openSession(autoCommit);
    }
}
