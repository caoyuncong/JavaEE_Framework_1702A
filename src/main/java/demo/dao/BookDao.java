package demo.dao;

import demo.model.Book;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/14/17 10:46
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public interface BookDao {

    void create(Book book);

    List<Book> queryAll();

    Book queryBookById(int id);

    void modify(Book book);

    void remove(int id);

}
