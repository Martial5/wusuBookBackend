package com.wusu.model;

public class UserFavorite {

    private int user_favorite_id;
    private int user_id;
    private int book_id;
    private int user_favorite_del;

    public int getUser_favorite_id() {
        return user_favorite_id;
    }

    public void setUser_favorite_id(int user_favorite_id) {
        this.user_favorite_id = user_favorite_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getUser_favorite_del() {
        return user_favorite_del;
    }

    public void setUser_favorite_del(int user_favorite_del) {
        this.user_favorite_del = user_favorite_del;
    }
}