package com.wusu.service.impl;

import com.wusu.dao.BookDao;
import com.wusu.dao.UserFavoriteDao;
import com.wusu.model.Book;
import com.wusu.service.UserFavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userFavoriteService")
public class UserFavoriteServiceImpl implements UserFavoriteService {

    @Resource
    private BookDao bookDao;
    @Resource
    private UserFavoriteDao userFavoriteDao;

    @Override
    public List<Book> findUserFavorite(int user_id){

        List<Book> bookList = userFavoriteDao.findUserFavoriteBookList(user_id);
        return bookList;
    }


}