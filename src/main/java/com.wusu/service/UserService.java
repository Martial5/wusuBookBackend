package com.wusu.service;

import com.wusu.model.User;

public interface UserService {
    public User findUserById(int user_id);

    public User findUserByName(String user_name);

    public String addUser(User user);
}