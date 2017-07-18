package demo.dao.impl;

import demo.dao.GenericDao;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/18/17 14:10
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class JdbcDaoImpl<T> implements GenericDao<T> {
    @Override
    public void create(T t) {

    }

    @Override
    public T query(String statement, Object parameter) {
        return null;
    }

    @Override
    public List<T> queryAll() {
        return null;
    }

    @Override
    public T queryById(int id) {
        return null;
    }

    @Override
    public void modify(T t) {

    }

    @Override
    public void modify(String statement, Object parameter) {

    }

    @Override
    public void remove(int id) {

    }
}
