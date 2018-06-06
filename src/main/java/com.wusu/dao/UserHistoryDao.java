
package com.wusu.dao;

import com.wusu.model.Book;

import java.util.List;

public interface UserHistoryDao {
    //记录用户历史记录
    int addUserHistory(int user_id,int book_id)throws Exception;

    //根据user_id查找该用户的历史记录
    List<Book> findUserHistoryBookList(int user_id)throws Exception;
}