package com.wusu.service.impl;

import com.wusu.dao.IUserDao;
import com.wusu.model.UserTest;
import com.wusu.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserTestServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public UserTest selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}