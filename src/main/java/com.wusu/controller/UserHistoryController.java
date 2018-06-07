package com.wusu.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wusu.model.Book;
import com.wusu.model.User;
import com.wusu.service.UserHistoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/userHistory")
public class UserHistoryController {

    @Resource
    private UserHistoryService userHistoryService;

    @RequestMapping("/findUserHistory.do")
    public List<Book> selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //从session中获取user的值
        HttpSession session = request.getSession();
        User user =(User) session.getAttribute("User");
        int user_id = user.getUser_id();
        List<Book> historyBookList = userHistoryService.findUserHistory(user_id);
        return historyBookList;
    }

}