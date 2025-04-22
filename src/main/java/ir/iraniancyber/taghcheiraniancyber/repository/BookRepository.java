package ir.iraniancyber.taghcheiraniancyber.repository;

import ir.iraniancyber.taghcheiraniancyber.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findTop10ByImageNotNull();
}
