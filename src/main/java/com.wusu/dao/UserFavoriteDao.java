
package com.wusu.dao;
import java.util.List;
import com.wusu.model.Book;

public interface UserFavoriteDao {
    //根据user_id查找该用户的收藏图书list
    List<Book> findUserFavoriteBookList(int user_id)throws Exception;
    //收藏该图书
    int updateFavorite(int user_id,int book_id)throws Exception;
    //取消收藏该图书
    int de_updateFavorite(int user_id,int book_id)throws Exception;
}