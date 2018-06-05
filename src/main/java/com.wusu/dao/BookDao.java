
package com.wusu.dao;

import com.wusu.model.Book;

public interface BookDao {
    //用来查图书的全部信息
    Book findBookById(int book_id)throws Exception;
    //搜索按钮查图书的全部信息
    Book findBookByName(String book_name)throws Exception;
    //根据标签查询图书
    Book findBookByTag (String tag_name)throws Exception;

}