package com.wusu.model;
import java.util.Date;
public class UserHistory {

    private int user_history_id;
    private int user_id;
    private int book_id;
    private Date history_data;

    public int getUser_history_id() {
        return user_history_id;
    }

    public void setUser_history_id(int user_history_id) {
        this.user_history_id = user_history_id;
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

    public Date getHistory_data() {
        return history_data;
    }

    public void setHistory_data(Date history_data) {
        this.history_data = history_data;
    }
}