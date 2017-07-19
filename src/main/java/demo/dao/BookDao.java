package demo.dao;

import demo.model.Book;

/**
 * Created by mingfei.net@gmail.com
 * 7/14/17 10:46
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public interface BookDao extends GenericDao<Book> {
}


/*
DAO 接口的模板 template 模板\ ['templeɪt\;\ -plɪt]

package demo.dao;

import demo.model.{model};

public interface {model}Dao extends GenericDao<{model}> {}
 */