package com.wusu.model;

import java.util.Date;

public class User {

    private int user_id;
    private String user_name;
    private String user_pass;
    private int user_del;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public int getUser_del() {
        return user_del;
    }

    public void setUser_del(int user_del) {
        this.user_del = user_del;
    }




}