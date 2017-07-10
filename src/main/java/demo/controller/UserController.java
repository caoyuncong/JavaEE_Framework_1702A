package demo.controller;

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
public class UserController {

    @RequestMapping("create")
    private String create(User user) {
        // TODO: 7/10/17 save user...
        System.out.println("create...");
        return "redirect:/index.jsp";
    }
}
