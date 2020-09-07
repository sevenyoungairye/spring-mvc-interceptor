package cn.bitqian.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * spring mvc 拦截器入门
 * @author echo lovely
 * @date 2020/9/6 17:30
 */
public class MyInterceptor1 implements HandlerInterceptor {
    // 在目标方法执行之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("preHandler..");

        String param = request.getParameter("param");
        if ("yes".equals(param)) {
            return true;
        }

        // 参数错误跳转到错误的页面
        request.getRequestDispatcher("/error.jsp").forward(request, response);

        // 放行
        return false;
    }

    // 在目标方法执行之后，视图返回之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        // 可以在视图对象返回之前 修改model
        if (modelAndView != null)  // 如果访问的目标资源没有 ModelAndView返回，会null pointer
            modelAndView.addObject("name", "bitQian adorable");
        System.out.println("post handler");
    }

    // 在所有流程执行完后 执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("after completion");
    }
}
