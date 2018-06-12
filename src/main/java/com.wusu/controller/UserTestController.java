package com.wusu.controller;

import javax.servlet.http.HttpServletRequest;

import com.wusu.model.UserTest;
import com.wusu.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
@Controller
@RequestMapping("/userTest")
public class UserTestController {

    @Resource
    private IUserService iUserService;

    @RequestMapping("/showUser.do")
    @ResponseBody
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        UserTest user = this.iUserService.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }

    @RequestMapping("/makeATry.do")
    @ResponseBody
    public UserTest makeATry(HttpServletRequest request, HttpServletResponse response,ModelMap modelMap) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        modelMap.addAttribute("success",true);
        modelMap.addAttribute("boy",1);
        ObjectMapper mapper = new ObjectMapper();
        String a = request.getParameter("param1");
//        response.getWriter().write(mapper.writeValueAsString("123123"));
//        response.getWriter().write(mapper.writeValueAsString(a));

        UserTest userTest= new UserTest();
        userTest.setEmail("51321");
        response.getWriter().write(mapper.writeValueAsString(userTest));
        response.getWriter().flush();
        response.getWriter().close();
        return userTest;
    }

}