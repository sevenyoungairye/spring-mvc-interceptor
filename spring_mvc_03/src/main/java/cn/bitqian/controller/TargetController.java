package cn.bitqian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试拦截器
 * @author echo lovely
 * @date 2020/9/6 17:42
 */
@Controller
public class TargetController {

    @RequestMapping("/target1")
    public ModelAndView target1() {
        ModelAndView modelAndView = new ModelAndView();
        // 设置模型
        modelAndView.addObject("name", "bitqian");
        // 返回视图对象
        modelAndView.setViewName("demo1");

        System.out.println("target1 目标资源访问..");
        return modelAndView;
    }
}
