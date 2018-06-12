package com.wusu.service.impl;

import com.wusu.dao.UserDao;
import com.wusu.model.User;
import com.wusu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User findUserById(int user_id) {
        return this.userDao.findUserById(user_id);
    }
    @Override
    public User findUserByName(String user_name) {
        return this.userDao.findUserByName(user_name);
    }
    @Override
    public String addUser(User user) {
        return this.userDao.addUser(user);
    }

}