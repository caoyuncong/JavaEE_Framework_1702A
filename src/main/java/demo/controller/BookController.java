package demo.controller;

import demo.dao.BookDao;
import demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mingfei.net@gmail.com
 * 7/14/17 10:43
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
@Controller
@RequestMapping("book")
public class BookController extends BaseController {

    @Autowired
    private BookDao bookDao;

    @RequestMapping("create")
    private String create(Book book) {
        bookDao.create(book);
        return "redirect:/index.jsp";
    }

}
