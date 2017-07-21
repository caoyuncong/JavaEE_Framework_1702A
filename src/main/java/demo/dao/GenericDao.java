package demo.dao;

import demo.util.Pagination;

import java.io.Serializable;

/**
 * Created by mingfei.net@gmail.com
 * 7/17/17 10:38
 * https://github.com/thu/JavaEE_Framework_1702A/
 * ###通用的###数据库操作
 */
public interface GenericDao<T extends Serializable, ID extends Number> { // Model Entity Domain 域

    void create(T t);

    T query(String statement, Object parameter);

    Pagination<T> queryAll(int currentPage);

    Pagination<T> query(String statement, Object parameter, int currentPage);

    T queryById(ID id);

    void modify(T t);

    void modify(String statement, Object parameter);

    void remove(ID id);

}
