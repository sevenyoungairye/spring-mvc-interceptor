package cn.bitqian.controller;

import cn.bitqian.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author echo lovely
 * @date 2020/9/7 19:15
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/login")
    public String login(String userName, String password, HttpSession session) {

        if ("bitqian".equals(userName) && "bitqian666".equals(password)) {

            User user = new User(userName, password);
            // 账号密码正确设置 将用户对象保存到session中
            session.setAttribute("user", user);

            return  "redirect:/index.jsp";
        }

        System.out.println(userName + "\t" + password);

        return "redirect:/login.jsp";
    }
}
