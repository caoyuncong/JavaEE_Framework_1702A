package demo.service.impl;

import demo.service.GenericService;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/18/17 10:32
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class GenericServiceImpl<T> implements GenericService<T> {

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
