package demo.dao.impl;

import demo.dao.GenericDao;
import demo.util.Constant;
import demo.util.Pagination;
import org.apache.ibatis.session.RowBounds;
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

    // Pagination
    private Pagination<T> getPagination(int currentPage, String statement, Object parameter) {
        int totalRows = getTotalRows(statement, parameter);
        int totalPages = (int) Math.ceil(totalRows / (double) Constant.PAGE_SIZE);
        List<T> list = sqlSession.selectList(namespace.concat(statement), parameter, getRowBounds(currentPage));
        return new Pagination<T>(list, statement, Constant.PAGE_SIZE, totalRows, totalPages, currentPage);
    }

    private RowBounds getRowBounds(int currentPage) {
        int offset = Constant.PAGE_SIZE * (currentPage - 1);
        return new RowBounds(offset, Constant.PAGE_SIZE);
    }

    private int getTotalRows(String statement, Object parameter) {
        List<T> list = sqlSession.selectList(namespace.concat(statement), parameter);
        return list.size();
    }
}
