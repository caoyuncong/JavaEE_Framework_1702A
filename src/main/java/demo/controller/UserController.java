package demo.controller;

import demo.dao.UserDao;
import demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mingfei.net@gmail.com
 * 7/10/17 16:10
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping("create")
    private String create(User user) {
        userDao.create(user);
        return "redirect:/default.jsp";
    }

    @RequestMapping("signIn")
    private String signIn(User user) {
        user = userDao.signIn(user);
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/index.jsp";
        }
        request.setAttribute("message", "用户名或密码错误");
        return "/default.jsp";
    }
}
