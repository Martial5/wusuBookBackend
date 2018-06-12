package com.wusu.service;
import java.util.List;

import com.wusu.model.Book;
import com.wusu.model.UserTag;

public interface UserTagService {
    public List<Book> findHotBook(int num);

    public List<UserTag> getUserTag(int user_id);
//
//    public String addUserTag(int user_id,String tag_name);
}