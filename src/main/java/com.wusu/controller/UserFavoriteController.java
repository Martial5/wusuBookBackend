package com.wusu.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
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

@Controller
@RequestMapping("/userFavorite")
public class UserFavoriteController {

    @Resource
    private UserFavoriteService userFavoriteService;

    @RequestMapping("/findUserFavorite.do")
    public List<Book> findUserFavorite(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //从session中获取user的值
        HttpSession session = request.getSession();
        User user =(User) session.getAttribute("User");
        int user_id = user.getUser_id();
        List<Book> favoriteBookList = userFavoriteService.findUserFavorite(user_id);
        return favoriteBookList;
    }

    public String addUserFavorite(int book_id,HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //从session中获取user的值
        HttpSession session = request.getSession();
        User user =(User) session.getAttribute("User");
        int user_id = user.getUser_id();
        if(userFavoriteService.addUserFavorite(user_id,book_id) != null) {
            return "success";
        }
        else return "false";

    }

}