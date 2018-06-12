package com.wusu.service.impl;

import com.wusu.dao.BookDao;
import com.wusu.model.Book;
import com.wusu.model.User;
import com.wusu.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public List<Book> findBookByTag(){
        String tag_name = "小说";
        List<Book> bookList = bookDao.findBookByTag(tag_name);
        return bookList;
    }

    @Override
    public List<Book> findBookByName(String book_name){
        List<Book> bookList = bookDao.findBookByName(book_name);
        return bookList;
    }

    @Override
    public Book getBook(int book_id){
        Book book = bookDao.findBookById(book_id);
        return book;
    }

}