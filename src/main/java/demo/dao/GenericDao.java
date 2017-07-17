package demo.dao;

import demo.model.User;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/17/17 10:38
 * https://github.com/thu/JavaEE_Framework_1702A/
 * ###通用的###数据库操作
 */
public interface GenericDao<T> { // Model Entity Domain 域

    void create(T t);

    T query(String statement, Object parameter);

    List<T> queryAll();

    T queryById(int id);

    void modify(T t);

    void remove(int id);

}
