package ir.iraniancyber.taghcheiraniancyber.service;

import ir.iraniancyber.taghcheiraniancyber.model.Book;
import ir.iraniancyber.taghcheiraniancyber.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(int id) {
        Optional<Book> byId = bookRepository.findById(id);
        return byId.get();
    }

    @Override
    public List<Book> top10Book() {
        return bookRepository.findTop10ByImageNotNull();
    }
}
