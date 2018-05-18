
package com.wusu.dao;

import com.wusu.model.User;

public interface IUserDao {

    User selectUser(long id);

}