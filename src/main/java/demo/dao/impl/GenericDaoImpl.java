package demo.dao.impl;

import demo.dao.GenericDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/17/17 11:30
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class GenericDaoImpl<T extends Serializable, ID extends Number> implements GenericDao<T, ID> {

    private String namespace;

    @Autowired
    private SqlSession sqlSession;

    public GenericDaoImpl() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        Class clazz = (Class) parameterizedType.getActualTypeArguments()[0];
        namespace = StringUtils.uncapitalize(clazz.getSimpleName());
    }

    @Override
    public void create(T t) {
        sqlSession.insert(namespace.concat(".create"), t);
    }

    @Override
    public T query(String statement, Object parameter) {
        return sqlSession.selectOne(namespace.concat(".").concat(statement), parameter);
    }

    @Override
    public List<T> queryAll() {
        return sqlSession.selectList(namespace.concat(".queryAll"));
    }

    @Override
    public List<T> list(int page) {
        return sqlSession.selectList(namespace.concat(".list"));
    }

    @Override
    public T queryById(ID id) {
        return sqlSession.selectOne(namespace.concat(".queryById"), id);
    }

    @Override
    public void modify(T t) {
        sqlSession.update(namespace.concat(".modify"), t);
    }

    @Override
    public void modify(String statement, Object parameter) {
        sqlSession.update(namespace.concat(".").concat(statement), parameter);
    }

    @Override
    public void remove(ID id) {
        sqlSession.delete(namespace.concat(".remove"), id);
    }
}
