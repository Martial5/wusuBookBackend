
package com.wusu.dao;

import com.wusu.model.UserTest;

public interface IUserDao {

    UserTest selectUser(long id);

}