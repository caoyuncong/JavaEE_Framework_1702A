package demo.controller;

import demo.dao.UserDao;
import demo.model.User;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired // 自动装配
    private UserDao userDao;

    @RequestMapping("create")
    private String create(User user) {
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        user.setPassword(encryptor.encryptPassword(user.getPassword()));
        userDao.create(user);
        return "redirect:/default.jsp";
    }

    @RequestMapping("signIn")
    private String signIn(User user) {
        String plainPassword = user.getPassword();
        user = userDao.query("queryPasswordByUsername", user.getUsername());
        if (user != null) {
            String encryptedPassword = user.getPassword();
            StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
            if (encryptor.checkPassword(plainPassword, encryptedPassword)) {
                userDao.modify("updateLastTime", user.getId()); // update last login time
                session.setAttribute("user", user);
                return "redirect:/book/queryAll";
            }
        }
        request.setAttribute("message", "用户名或密码错误");
        return "/default.jsp";
    }

    @RequestMapping("signOut")
    private String signOut() {
        session.invalidate();
        return "redirect:/default.jsp";
    }
}
