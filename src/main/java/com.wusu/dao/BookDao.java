
package com.wusu.dao;

import com.wusu.model.Book;

import java.util.List;

public interface BookDao {
    //用来查图书的全部信息
    Book findBookById(int book_id);
    //搜索按钮查图书的全部信息
    List<Book> findBookByName(String book_name);
    //根据标签查询图书
    List<Book> findBookByTag (String tag_name);

}