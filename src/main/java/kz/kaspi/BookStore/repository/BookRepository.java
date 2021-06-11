package kz.kaspi.BookStore.repository;

import kz.kaspi.BookStore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByCategory(String category);

    List<Book> findByTitleContaining(String title);




}
