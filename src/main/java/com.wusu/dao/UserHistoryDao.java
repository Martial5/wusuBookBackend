
package com.wusu.dao;

import com.wusu.model.Book;

import java.util.List;

public interface UserHistoryDao {
    //根据user_id查找该用户的历史记录
    List<Book> findUserHistoryBookList(int user_id)throws Exception;
}