package demo.service.impl;

import demo.dao.GenericDao;
import demo.model.Book;
import demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by mingfei.net@gmail.com
 * 7/18/17 10:35
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
@Service
public class BookServiceImpl extends GenericServiceImpl<Book> implements BookService {

    @Override
    @Autowired
    @Qualifier("bookDaoImpl")
    public void setGenericDao(GenericDao<Book> genericDao) {
        super.genericDao = genericDao;
    }
}
