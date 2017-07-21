package demo.controller;

import demo.model.User;
import demo.service.UserService;
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

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("signUp")
    private String signUp(User user) {
        if (userService.signUp(user)) {
            return "redirect:/default.jsp";
        }
        request.setAttribute("message", "用户名已经存在");
        return "/sign_up.jsp";
    }

    @RequestMapping("signIn")
    private String signIn(User user) {
        user = userService.signIn(user);
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/book/queryAll/1";
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
