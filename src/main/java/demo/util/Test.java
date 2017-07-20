package demo.util;

import demo.model.Book;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 7/20/17 17:07
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class Test {
    public static void main(String[] args) {
        /*
            pageSize
            totalRows
            totalPages
            currentPage
         */

        int pageSize = 10; // 自定义

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSession sqlSession = (SqlSession) applicationContext.getBean("sqlSession");

        String statement = "book.queryTest";
        String parameter = "title...";

        List<Book> books = sqlSession.selectList(statement, parameter);

        int totalRows = books.size();
        int totalPages = (int) Math.ceil(totalRows / (double) pageSize);
        int currentPage = 3; //
        RowBounds rowBounds = new RowBounds((currentPage - 1) * pageSize, pageSize);

        List<Book> list = sqlSession.selectList(statement, parameter, rowBounds);

        Pagination<Book> pagination = new Pagination<>(list, statement, pageSize, totalRows, totalPages, currentPage);
        System.out.println(pagination);
    }
}
