package demo.dao.impl;

import demo.dao.BookDao;
import demo.model.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by mingfei.net@gmail.com
 * 7/14/17 10:47
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void create(Book book) {
        sqlSession.insert("book.create", book);
    }
}
