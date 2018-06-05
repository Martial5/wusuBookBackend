package com.wusu.model;

public class UserTag {

    private int user_tag_id;
    private int user_id;
    private String tag_name;
    private int tag_collect_times;
    private int tag_iscollected;

    public int getUser_tag_id() {
        return user_tag_id;
    }

    public void setUser_tag_id(int user_tag_id) {
        this.user_tag_id = user_tag_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public int getTag_collect_times() {
        return tag_collect_times;
    }

    public void setTag_collect_times(int tag_collect_times) {
        this.tag_collect_times = tag_collect_times;
    }

    public int getTag_iscollected() {
        return tag_iscollected;
    }

    public void setTag_iscollected(int tag_iscollected) {
        this.tag_iscollected = tag_iscollected;
    }
}