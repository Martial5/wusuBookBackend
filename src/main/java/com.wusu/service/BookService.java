package com.wusu.service;

import com.wusu.model.Book;
import java.util.List;

public interface BookService {

    public List<Book> findBookByTag();

    public List<Book> findBookByName(String book_name);

    public Book getBook(int book_id);
}