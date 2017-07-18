package demo.service.impl;

import demo.dao.GenericDao;
import demo.service.GenericService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/18/17 10:32
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public abstract class GenericServiceImpl<T extends Serializable> implements GenericService<T> {

    GenericDao<T> genericDao;

    public abstract void setGenericDao(GenericDao<T> genericDao);

    @Override
    public void create(T t) {
        genericDao.create(t);
    }

    @Override
    public T query(String statement, Object parameter) {
        return genericDao.query(statement, parameter);
    }

    @Override
    public List<T> queryAll() {
        return genericDao.queryAll();
    }

    @Override
    public T queryById(int id) {
        return genericDao.queryById(id);
    }

    @Override
    public void modify(T t) {
        genericDao.modify(t);
    }

    @Override
    public void modify(String statement, Object parameter) {
        genericDao.modify(statement, parameter);
    }

    @Override
    public void remove(int id) {
        genericDao.remove(id);
    }
}
