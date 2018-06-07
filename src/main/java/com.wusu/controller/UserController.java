package com.wusu.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wusu.model.User;
import com.wusu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户登录
     */
    @RequestMapping("/userLogin.do")
    public String userLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String user_name = request.getParameter("user_name");
        String user_pass = request.getParameter("user_pass");
        User user = this.userService.findUserByName(user_name);
        if(user.getUser_pass()==user_pass && user.getUser_del() !=0){
            HttpSession session=request.getSession();
            session.setAttribute("user", user);
            return "success";
        }
        else
            return "false";
    }

    /**
     * 用户注册
     */
    @RequestMapping("/addUser.do")
    public String addUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String user_name = request.getParameter("user_name");
        String user_pass = request.getParameter("user_pass");
        User user = new User();
        user.setUser_name(user_name);
        user.setUser_pass(user_pass);
        if(this.userService.findUserByName(user_name)!=null){
            this.userService.addUser(user);
            return "success";
        }
        else return "exist";
    }

}