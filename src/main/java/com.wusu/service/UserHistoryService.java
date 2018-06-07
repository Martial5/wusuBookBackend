package com.wusu.service;

import com.wusu.model.User;
import com.wusu.model.Book;
import java.util.List;

public interface UserHistoryService {

    public List<Book> findUserHistory(int user_id);

}