package demo.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/18/17 10:31
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public interface GenericService<T extends Serializable> {

    void create(T t);

    T query(String statement, Object parameter);

    List<T> queryAll();

    T queryById(int id);

    void modify(T t);

    void modify(String statement, Object parameter);

    void remove(int id);

}
