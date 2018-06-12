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
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户登录
     */
    @RequestMapping("/userLogin.do")
    public void userLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = new HashMap<String, Object>();

        String user_name = request.getParameter("user_name");
        User user = this.userService.findUserByName(user_name);
        map.put("thisUser",user);
        String out = objectMapper.writeValueAsString(map);//开始序列化
        response.getWriter().write(out);
        response.getWriter().flush();
        response.getWriter().close();
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