package com.wusu.service.impl;

import com.wusu.dao.BookDao;
import com.wusu.dao.UserHistoryDao;
import com.wusu.model.Book;
import com.wusu.service.UserHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userHistoryService")
public class UserHistoryServiceImpl implements UserHistoryService {

    @Resource
    private BookDao bookDao;
    @Resource
    private UserHistoryDao userHistoryDao;

    @Override
    public List<Book> findUserHistory(int user_id){
        List<Book> bookList = userHistoryDao.findUserHistoryBookList(user_id);
        return bookList;
    }

//    @Override
//    public List<Book> findUserFavorite(int user_id){
//
//        List<Book> bookList = userFavoriteDao.findUserFavoriteBookList(user_id);
//        return bookList;
//    }


}