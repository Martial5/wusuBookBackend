package com.wusu.service.impl;

import com.wusu.dao.BookDao;
import com.wusu.dao.UserTagDao;
import com.wusu.model.Book;
import com.wusu.model.UserTag;
import com.wusu.service.UserTagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userTagService")
public class UserTagServiceImpl implements UserTagService {

    @Resource
    private BookDao bookDao;
    @Resource
    private UserTagDao userTagDao;

    @Override
    public List<Book> findHotBook(int num){
        List<Book> bookList = userTagDao.findHotBook(num,num+100);
        return bookList;
    }

    @Override
    public List<UserTag> getUserTag(int user_id){

        List<UserTag> userTagList = userTagDao.findUserTagById(user_id);
        return userTagList;
    }


}