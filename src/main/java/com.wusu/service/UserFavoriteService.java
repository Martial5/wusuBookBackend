package com.wusu.service;

import com.wusu.model.Book;

import java.util.List;

public interface UserFavoriteService {

    public List<Book> findUserFavorite(int user_id);

    public String addUserFavorite(int user_id,int book_id);
}