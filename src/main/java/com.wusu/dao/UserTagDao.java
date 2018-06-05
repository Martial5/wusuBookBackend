
package com.wusu.dao;

import com.wusu.model.UserTag;

import java.util.List;

public interface UserTagDao {
    //根据user_id查找该用户的标签
    List<UserTag> findUserTagById(int user_id)throws Exception;
    //用户添加tag
    int updateTag(String tag_name)throws Exception;
    //用户删除tag
    int de_updateTag(String tag_name)throws Exception;
}