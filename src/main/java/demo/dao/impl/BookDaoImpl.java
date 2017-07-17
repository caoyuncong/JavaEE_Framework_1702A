package demo.dao.impl;

import demo.dao.BookDao;
import demo.model.Book;
import org.springframework.stereotype.Repository;

/**
 * Created by mingfei.net@gmail.com
 * 7/14/17 10:47
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
@Repository
public class BookDaoImpl extends GenericDaoImpl<Book> implements BookDao {
}
