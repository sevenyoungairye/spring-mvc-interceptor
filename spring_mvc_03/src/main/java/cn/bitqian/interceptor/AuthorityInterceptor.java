package cn.bitqian.interceptor;

import cn.bitqian.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author echo lovely
 * @date 2020/9/7 19:42
 */
public class AuthorityInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            // 未登录跳转到登录页面
            response.sendRedirect("login.jsp");
            return false;
        }

        System.out.println("user permission..");
        return true;
    }
}
