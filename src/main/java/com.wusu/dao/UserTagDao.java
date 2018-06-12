
package com.wusu.dao;

import com.wusu.model.UserTag;
import com.wusu.model.Book;
import java.util.List;

public interface UserTagDao {
    //根据user_id查找该用户的标签
    List<Book> findHotBook(int mum,int num2);

    //根据user_id查找该用户的标签
    List<UserTag> findUserTagById(int user_id);
    //用户添加tag
    int addTag(int user_id,String tag_name);
    //用户删除tag
    int de_updateTag(int user_id,String tag_name);
    //用户恢复tag
    int updateTag(int user_id,String tag_name);
}