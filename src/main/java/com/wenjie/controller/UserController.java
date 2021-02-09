package com.wenjie.controller;

import com.wenjie.domain.User;
import com.wenjie.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService service;

    //注册学生
    @RequestMapping("/login")
    public ModelAndView userLogin(User user){
        ModelAndView mv = new ModelAndView();
        String tips = "登录失败";
        //调用service处理student
        int nums = service.findUser(user);
        if( nums > 0 ){
            //注册成功
            tips = "学生【" + user.getUsername() + "】登录成功";
        }
        //添加数据
        mv.addObject("tips",tips);

        //指定结果页面
        mv.setViewName("result");
        return mv;
    }
}
