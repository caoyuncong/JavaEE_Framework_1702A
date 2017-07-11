package demo.controller;

import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.session.SqlSession;
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
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            sqlSession.insert("user.create", user);
        }
        return "redirect:/default.jsp";
    }
}
