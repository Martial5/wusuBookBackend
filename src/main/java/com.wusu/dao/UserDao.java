
package com.wusu.dao;

import com.wusu.model.User;

public interface UserDao {
    //用来查用户基本信息
    User findUserById(int user_id);
    //注册新用户的时候用
    String addUser(User user);
    //登录时，注册新用户查重名时候用
    User findUserByName(String user_name);


}