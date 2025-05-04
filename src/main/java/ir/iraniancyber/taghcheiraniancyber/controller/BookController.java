package ir.iraniancyber.taghcheiraniancyber.controller;

import ir.iraniancyber.taghcheiraniancyber.dto.BookDto;
import ir.iraniancyber.taghcheiraniancyber.model.Book;
import ir.iraniancyber.taghcheiraniancyber.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    
    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public void save(@RequestBody BookDto bookDto) {
        bookService.saveBook(BookDto.convertBookDtoToBook(bookDto));
    }

    @GetMapping("/list")
    public List<Book> list() {
        return bookService.getAllBooks();
    }

    @GetMapping("/top10Book")
    public List<Book> top10Book() {
        return bookService.top10Book();
    }

    @GetMapping("/findById")
    public BookDto findById(@RequestParam int id) {
        Book book = bookService.getBook(id);
        return BookDto.convertBookToBookDto(book);
    }

    @GetMapping("/deleteBook")
    public void deleteBook(@RequestParam int id) {
        bookService.deleteBook(id);
    }


}
