package com.wusu.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import com.wusu.model.User;
import com.wusu.model.Book;
import com.wusu.model.UserTag;
import com.wusu.service.BookService;
import com.wusu.service.UserTagService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/book")
public class BookController {

    @Resource
    private BookService bookService;
    @Resource
    private UserTagService userTagService;

    @RequestMapping("/getBookList.do")
    public List<Book> selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //从session中获取user的值
        HttpSession session = request.getSession();
        User user =(User) session.getAttribute("User");
        //利用user_id获取tag
        int user_id = user.getUser_id();
        List<UserTag> userTagList = userTagService.getUserTag(user_id);
//        需要根据tag进行计算
//
//
        List<Book> bookList = bookService.getBookList();
        return bookList;
    }

    @RequestMapping("/getBook.do")
    public Book selectUser(int book_id,HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Book book = bookService.getBook(book_id);
        return book;
    }

}