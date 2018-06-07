package com.wusu.service;

import com.wusu.model.Book;
import java.util.List;

public interface BookService {

    public List<Book> getBookList();

    public Book getBook(int book_id);
}