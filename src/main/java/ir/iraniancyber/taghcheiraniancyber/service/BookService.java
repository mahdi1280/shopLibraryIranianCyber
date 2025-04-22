package ir.iraniancyber.taghcheiraniancyber.service;

import ir.iraniancyber.taghcheiraniancyber.model.Book;

import java.util.List;

public interface BookService {

    void saveBook(Book book);

    void updateBook(Book book);

    void deleteBook(int id);

    List<Book> getAllBooks();

    Book getBook(int id);

    List<Book> top10Book();
}
