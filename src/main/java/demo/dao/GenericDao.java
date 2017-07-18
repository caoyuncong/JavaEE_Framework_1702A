package demo.dao;

import demo.model.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/17/17 10:38
 * https://github.com/thu/JavaEE_Framework_1702A/
 * ###通用的###数据库操作
 */
public interface GenericDao<T extends Serializable> { // Model Entity Domain 域

    void create(T t);

    T query(String statement, Object parameter);

    List<T> queryAll();

//    List<T> queryList(String statement, Object parameter);

    T queryById(int id);

    void modify(T t);

    void modify(String statement, Object parameter);

    void remove(int id);

}
