package com.wusu.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wusu.model.User;
import com.wusu.model.UserTag;
import com.wusu.model.UserTest;
import com.wusu.service.UserTagService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/userTag")
public class UserTagController {

    @Resource
    private UserTagService userTagService;

    @RequestMapping("/getUserTag.do")
    public List<UserTag> getUserTag(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //从session中获取user的值
        HttpSession session = request.getSession();
        User user =(User) session.getAttribute("User");
        //利用user_id获取tag
        int user_id = user.getUser_id();
        List<UserTag> userTagList = userTagService.getUserTag(user_id);
        return userTagList;
    }

    @RequestMapping("/addUserTag.do")
    public String getUserTag(String tag_name,HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //从session中获取user的值
        HttpSession session = request.getSession();
        User user =(User) session.getAttribute("User");
        //利用user_id获取tag
        int user_id = user.getUser_id();
        if(userTagService.addUserTag(user_id,tag_name)!=null) {
            return "success";
        }
        else return "fales";
    }

}