
package com.wusu.dao;

import com.wusu.model.UserTag;

import java.util.List;

public interface UserTagDao {
    //根据user_id查找该用户的标签
    List<UserTag> findUserTagById(int user_id)throws Exception;
    //用户添加tag
    int addTag(int user_id,String tag_name)throws Exception;
    //用户删除tag
    int de_updateTag(int user_id,String tag_name)throws Exception;
    //用户恢复tag
    int updateTag(int user_id,String tag_name)throws Exception;
}