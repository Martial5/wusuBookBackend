package com.wusu.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import com.wusu.model.User;
import com.wusu.model.Book;
import com.wusu.model.UserTag;
import com.wusu.service.BookService;
//import com.wusu.service.UserTagService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.Map;
import java.util.HashMap;
@Controller
@RequestMapping("/book")
public class BookController {

    @Resource
    private BookService bookService;
//    @Resource
//    private UserTagService userTagService;

//*****************
//****
//****
//****获得图书推荐列表
    @RequestMapping("/getBookList.do")
    public void getBookList(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //从session中获取user的值
//        HttpSession session = request.getSession();
//        User user =(User) session.getAttribute("User");
        //利用user_id获取tag
//        int user_id = user.getUser_id();
//        List<UserTag> userTagList = userTagService.getUserTag(user_id);
//        需要根据tag进行计算
//
        List<Book> bookList = bookService.findBookByTag();
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bookList",bookList);
        String out = objectMapper.writeValueAsString(map);//开始序列化
        response.getWriter().write(out);
        response.getWriter().flush();
        response.getWriter().close();
    }

//*****************
//****
//****
//****搜索图书
    @RequestMapping("/findBookByName.do")
    public void findBookByName(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String book_name = request.getParameter("book_name");

        List<Book> showBookList = bookService.findBookByName(book_name);
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ShowBookList",showBookList);
        String out = objectMapper.writeValueAsString(map);//开始序列化
        response.getWriter().write(out);
        response.getWriter().flush();
        response.getWriter().close();

    }

    @RequestMapping("/getBook.do")
    public void getBook(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String book_id1 = request.getParameter("book_id");
        int book_id = Integer.parseInt(book_id1);
        Book book = bookService.getBook(book_id);

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("thisBook",book);
        String out = objectMapper.writeValueAsString(map);//开始序列化
        response.getWriter().write(out);
        response.getWriter().flush();
        response.getWriter().close();
    }

}