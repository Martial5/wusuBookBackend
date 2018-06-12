package com.wusu.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;
import com.wusu.model.User;
import com.wusu.model.Book;
import com.wusu.service.UserFavoriteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/userFavorite")
public class UserFavoriteController {

    @Resource
    private UserFavoriteService userFavoriteService;

    @RequestMapping("/findUserFavorite.do")
    public void findUserFavorite(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //从session中获取user的值
        HttpSession session = request.getSession();
//        User user =(User) session.getAttribute("User");
        int user_id = 1;
        List<Book> favoriteBookList = userFavoriteService.findUserFavorite(user_id);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("favoriteList",favoriteBookList);
        ObjectMapper objectMapper = new ObjectMapper();
        String resultList = objectMapper.writeValueAsString(map);//开始序列化
        response.getWriter().write(resultList);
        response.getWriter().flush();
        response.getWriter().close();
    }

//    public String addUserFavorite(int book_id,HttpServletRequest request, HttpServletResponse response) throws IOException {
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        //从session中获取user的值
//        HttpSession session = request.getSession();
//        User user =(User) session.getAttribute("User");
//        int user_id = user.getUser_id();
//        if(userFavoriteService.addUserFavorite(user_id,book_id) != null) {
//            return "success";
//        }
//        else return "false";
//    }

}